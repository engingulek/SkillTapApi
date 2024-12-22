package com.example.SkillTapApi.core.response;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreelancerDetailResponse {
 
    private int id;

    
    private String imageURL;

    
    private String title;

    
    private String subTitle;

    
    private String detail;

    
    private Double rating;

    private List<SearchAdvertResponse> adverts;

    
}
