package com.project.config;

import com.project.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Appconfig {
    @Bean("Khushi")
    public CourseService getCourseService(){
        return new CourseService();// returns new or blank object of type CourseService class
    }
}
