package com.example.SkillTapApi.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchAdvertResponse {
    

    private int id;

    
    private String imageURL;

    
    private String title;

    private Integer price;

    
    private String detail;
}
