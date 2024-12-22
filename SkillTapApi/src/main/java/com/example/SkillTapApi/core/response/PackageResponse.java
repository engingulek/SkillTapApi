package com.example.SkillTapApi.core.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class PackageResponse {

    private int id;


    
    private String title;

    
    private String package_type;

    
    private String detail;

    
    private Integer price;
}
