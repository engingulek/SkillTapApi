package com.example.SkillTapApi.core.response;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchFreelancerResponse {

    private int id;

    
    private String imageURL;

    
    private String title;

    
    private String subTitle;

    
    private String detail;

    
    private Double rating;
}
