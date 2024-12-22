package com.example.SkillTapApi.core.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {

    private int id;


    private String title;


    private String imageURL;

   
    private int advert_count;


    private int freelancer_count;

   
    private String color_code;
    
}
