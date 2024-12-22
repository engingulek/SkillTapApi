package com.example.SkillTapApi.business.concrates;

import java.util.List;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillTapApi.business.abstracts.AdvertsService;
import com.example.SkillTapApi.core.mappers.ModelMapperService;

import com.example.SkillTapApi.core.response.AdvertDetailFreelancerResponse;
import com.example.SkillTapApi.core.response.AdvertDetailResponse;
import com.example.SkillTapApi.core.response.PackageResponse;
import com.example.SkillTapApi.core.response.SearchAdvertResponse;
import com.example.SkillTapApi.dataAccess.AdvertsRepository;
import com.example.SkillTapApi.dataAccess.FreelancerRepository;
import com.example.SkillTapApi.dataAccess.PackageRepository;
import com.example.SkillTapApi.entities.Adverts;
import com.example.SkillTapApi.entities.Freelancer;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import com.example.SkillTapApi.entities.Package;
@Service
@AllArgsConstructor
@NoArgsConstructor
public class AdvertsManager implements AdvertsService {
    @Autowired
    private AdvertsRepository advertsRepository;

    @Autowired
    private FreelancerRepository freelancerRepository;

    @Autowired
    private PackageRepository packageRepository;

      @Autowired
    private ModelMapperService modelMapperService;
    @Override
    public List<SearchAdvertResponse> getAllSearchAdvertResponse() {
        List<Adverts> adverts = advertsRepository.findAll();
 
        List<SearchAdvertResponse> searchAdvertResponses = adverts.stream()
        .map(category -> modelMapperService.forResponse().map(category, SearchAdvertResponse.class))
        .collect(Collectors.toList());
            return  searchAdvertResponses;
    }
    @Override
    public AdvertDetailResponse getAdvertDetail(int id) {
     Adverts advert = advertsRepository.findById(id)
     .orElseThrow(() -> new EntityNotFoundException("Movie not found with id: " + id));

     // Freelancer
     Integer freelancer_id = advert.getFreelancerId();
     Freelancer freelancer = freelancerRepository.findById(freelancer_id)
     .orElseThrow(() -> new EntityNotFoundException("Movie not found with id: " + id));

     AdvertDetailFreelancerResponse advertDetailFreelancerResponse = modelMapperService.forResponse()
     .map(freelancer, AdvertDetailFreelancerResponse.class);
    //

    // Packages

    Integer  advert_id = advert.getId();
    List<Package> packages = packageRepository.findAllByAdvertId(advert_id);
    
    List<PackageResponse> packageResponses = packages.stream()
    .map(category -> modelMapperService.forResponse().map(category, PackageResponse.class))
    .collect(Collectors.toList());


     AdvertDetailResponse advertDetailResponse = modelMapperService.forResponse()
        .map(advert, AdvertDetailResponse.class);

        advertDetailResponse.setFreelancer(advertDetailFreelancerResponse);
        advertDetailResponse.setPackages(packageResponses);
        return advertDetailResponse;
    }
    
}
