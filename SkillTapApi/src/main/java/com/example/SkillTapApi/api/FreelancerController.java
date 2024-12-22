package com.example.SkillTapApi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillTapApi.business.abstracts.FreelancerService;
import com.example.SkillTapApi.core.response.FreelancerDetailResponse;
import com.example.SkillTapApi.core.response.SearchFreelancerResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/freelancer/")
@AllArgsConstructor
@NoArgsConstructor
public class FreelancerController {
    @Autowired
    private FreelancerService freelancerService;

    @GetMapping("getAll")
    public List<SearchFreelancerResponse> getAll(){
        return freelancerService.getFreelancerResponses();
    }

    @GetMapping("getFreelancerDetail")
    public FreelancerDetailResponse getFreelancerDetail(@RequestParam int id){
        return freelancerService.getFreelancerDetailResponse(id);
    }

}
