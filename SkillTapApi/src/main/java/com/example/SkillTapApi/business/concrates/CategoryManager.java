package com.example.SkillTapApi.business.concrates;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SkillTapApi.business.abstracts.CategoryService;
import com.example.SkillTapApi.core.mappers.ModelMapperService;
import com.example.SkillTapApi.core.response.CategoryResponse;
import com.example.SkillTapApi.dataAccess.CategoryRepository;
import com.example.SkillTapApi.entities.Category;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class CategoryManager  implements  CategoryService {
    @Autowired
     private CategoryRepository categoryRepository;
     @Autowired
    private ModelMapperService modelMapperService;
    @Override
    public List<CategoryResponse> getCategoryResponses() {
        List<Category> categories = categoryRepository.findAll();
        
        List<CategoryResponse> categoryResponses = categories.stream()
        .map(category -> modelMapperService.forResponse().map(category, CategoryResponse.class))
        .collect(Collectors.toList());
            return  categoryResponses;
    }     
}
