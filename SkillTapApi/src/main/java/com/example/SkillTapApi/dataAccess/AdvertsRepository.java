package com.example.SkillTapApi.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SkillTapApi.entities.Adverts;

public interface AdvertsRepository extends JpaRepository<Adverts,Integer> {
    List<Adverts> findAllByFreelancerId(int freelancer_id);
} 