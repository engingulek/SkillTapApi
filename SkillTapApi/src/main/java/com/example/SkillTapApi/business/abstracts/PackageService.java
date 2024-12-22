package com.example.SkillTapApi.business.abstracts;

import java.util.List;

import com.example.SkillTapApi.core.response.PackageResponse;

public interface PackageService {
    List<PackageResponse> getPackagesByAdvertId(int advertId );
    
}