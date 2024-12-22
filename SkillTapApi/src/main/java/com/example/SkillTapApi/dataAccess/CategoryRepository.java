package com.example.SkillTapApi.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SkillTapApi.entities.Category;
public interface CategoryRepository extends JpaRepository<Category,Integer> {
    
}
