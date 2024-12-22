package com.example.SkillTapApi.dataAccess;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.SkillTapApi.entities.Package;

public interface PackageRepository extends JpaRepository<Package,Integer> {
    List<Package> findAllByAdvertId(int advert_id);
    
} 
