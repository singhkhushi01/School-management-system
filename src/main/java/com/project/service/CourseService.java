package com.project.service;
import com.project.model.Course;
import com.project.repository.CourseRepository;

import java.util.*;
import java.util.Optional;
@org.springframework.stereotype.Service
public class CourseService implements Service<Course>{

    private CourseRepository repository;
    public CourseService(CourseRepository courseRepository){
        repository = courseRepository;
    }
    @Override
    public List<Course> list() {
        return repository.findAll();
    }

    @Override
    public Course creates(Course course) {
        return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
