package com.example.SkillTapApi.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SkillTapApi.entities.Freelancer;

public interface FreelancerRepository extends JpaRepository<Freelancer,Integer> {

    
}