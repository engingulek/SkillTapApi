package com.example.SkillTapApi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SkillTapApi.business.abstracts.AdvertsService;
import com.example.SkillTapApi.core.response.AdvertDetailResponse;
import com.example.SkillTapApi.core.response.SearchAdvertResponse;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@RestController
@RequestMapping("api/adverts/")
@AllArgsConstructor
@NoArgsConstructor
public class AdvertsController {
    @Autowired
    private AdvertsService advertsService;

     @GetMapping("getAll")
    public List<SearchAdvertResponse> getAll(){
        return advertsService.getAllSearchAdvertResponse();
    }


    @GetMapping("advertDetail")
    public AdvertDetailResponse getAdvertDetail(@RequestParam int id){
        return advertsService.getAdvertDetail(id);
    }

}
