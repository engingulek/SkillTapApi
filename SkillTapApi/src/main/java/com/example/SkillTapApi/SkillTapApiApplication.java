package com.example.SkillTapApi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SkillTapApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkillTapApiApplication.class, args);
	}

		@Bean
	public ModelMapper getModelMapper() {
		return  new ModelMapper();
	}

}
