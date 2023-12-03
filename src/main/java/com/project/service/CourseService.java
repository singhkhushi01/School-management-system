package com.project.service;
import com.project.model.Course;

import java.util.*;
import java.util.Optional;

public class CourseService implements Service<Course>{

    private List<Course> courses;
    public CourseService(){
        courses=new ArrayList<>();
        Course springBoot = new Course(1, "spring boot started");
        courses.add(springBoot);
    }
    @Override
    public List<Course> list() {
        return courses;
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
