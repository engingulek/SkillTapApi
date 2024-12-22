package com.example.SkillTapApi.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Table(name= "categories")
@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "image_url")
    private String imageURL;

    @Column(name = "advert_count")
    private int advert_count;

    @Column(name = "freelancer_count")
    private int freelancer_count;

    @Column(name = "color_code")
    private String color_code;

    

    
}
