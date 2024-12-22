package com.example.SkillTapApi.business.concrates;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillTapApi.business.abstracts.FreelancerService;
import com.example.SkillTapApi.core.mappers.ModelMapperService;
import com.example.SkillTapApi.core.response.FreelancerDetailResponse;
import com.example.SkillTapApi.core.response.SearchAdvertResponse;
import com.example.SkillTapApi.core.response.SearchFreelancerResponse;
import com.example.SkillTapApi.dataAccess.AdvertsRepository;
import com.example.SkillTapApi.dataAccess.FreelancerRepository;
import com.example.SkillTapApi.entities.Adverts;
import com.example.SkillTapApi.entities.Freelancer;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class FreelancerManager implements FreelancerService {
    @Autowired 
    private FreelancerRepository freelancerRepository;

    @Autowired
    private AdvertsRepository advertsRepository;
 @Autowired
    private ModelMapperService modelMapperService;
    @Override
    public List<SearchFreelancerResponse> getFreelancerResponses() {
         List<Freelancer> freelancers = freelancerRepository.findAll();
 
        List<SearchFreelancerResponse> searchFreelancerResponses = freelancers.stream()
        .map(category -> modelMapperService.forResponse().map(category, SearchFreelancerResponse.class))
        .collect(Collectors.toList());
            return  searchFreelancerResponses;
    }
    @Override
    public FreelancerDetailResponse getFreelancerDetailResponse(int id) {
        
        Freelancer freelancer = freelancerRepository.findById(id)
        .orElseThrow(() -> new EntityNotFoundException("Movie not found with id: " + id));

        FreelancerDetailResponse freelancerDetailResponse = modelMapperService.forResponse()
        .map(freelancer, FreelancerDetailResponse.class);

        List<Adverts> adverts = advertsRepository.findAllByFreelancerId(freelancer.getId());

 List<SearchAdvertResponse> searchAdvertResponses = adverts.stream()
        .map(category -> modelMapperService.forResponse().map(category, SearchAdvertResponse.class))
        .collect(Collectors.toList());

        freelancerDetailResponse.setAdverts(searchAdvertResponses);
        

        return freelancerDetailResponse;
    }
    
}
