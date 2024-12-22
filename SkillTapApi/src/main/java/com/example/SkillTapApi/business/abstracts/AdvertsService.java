package com.example.SkillTapApi.business.abstracts;

import java.util.List;

import com.example.SkillTapApi.core.response.AdvertDetailResponse;
import com.example.SkillTapApi.core.response.SearchAdvertResponse;

public interface AdvertsService {
 List<SearchAdvertResponse> getAllSearchAdvertResponse();
 AdvertDetailResponse getAdvertDetail(int id);
    
}