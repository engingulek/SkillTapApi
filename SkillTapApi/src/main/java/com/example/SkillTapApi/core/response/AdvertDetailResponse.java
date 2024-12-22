package com.example.SkillTapApi.core.response;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdvertDetailResponse {
    private int id;
    private String image;
    private AdvertDetailFreelancerResponse freelancer;
    private List<PackageResponse> packages;

    
}
