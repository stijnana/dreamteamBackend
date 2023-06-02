package com.project.dreamteam.controller;
import com.project.dreamteam.model.Course;
import com.project.dreamteam.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    //Get requests
    @GetMapping("/courses")
    public List<Course> list() {
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Course course = courseRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok().body(course);
    }

    //Post requests
    @PostMapping("/courses")
    public void create (@RequestBody Course course) {
        courseRepository.save(course);
    }

    //Put requests
    @PutMapping("/courses")
    public void edit (@RequestBody Course course) {
        courseRepository.save(course);
    }

    //Delete requests
    @DeleteMapping("/courses/{id}")
    public void delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Course course = courseRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        courseRepository.delete(course);
    }
}
