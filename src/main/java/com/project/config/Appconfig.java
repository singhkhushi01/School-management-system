package com.project.config;

import com.project.repository.CourseRepository;
import com.project.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.project")
public class Appconfig {
//    @Bean("courseRepository")
//    public CourseRepository getCourseRepository(){
//        return new CourseRepository();
//    }
//    @Bean("Khushi")
//    public CourseService getCourseService(){
//        return new CourseService(getCourseRepository());// returns new or blank object of type CourseService class
//    }
}
