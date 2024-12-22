package com.example.SkillTapApi.business.abstracts;

import java.util.List;

import com.example.SkillTapApi.core.response.FreelancerDetailResponse;
import com.example.SkillTapApi.core.response.SearchFreelancerResponse;

public interface FreelancerService {
    List<SearchFreelancerResponse> getFreelancerResponses();
    FreelancerDetailResponse getFreelancerDetailResponse(int id);
    
} 
