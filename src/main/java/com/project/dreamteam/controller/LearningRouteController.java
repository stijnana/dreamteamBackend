package com.project.dreamteam.controller;

import com.project.dreamteam.model.LearningRoute;
import com.project.dreamteam.repository.LearningRouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LearningRouteController {
    @Autowired
    LearningRouteRepository learningRouteRepository;

    //Get requests
    @GetMapping("/learning-routes")
    public List<LearningRoute> list() {
        return learningRouteRepository.findAll();
    }

    @GetMapping("/learning-routes/{id}")
    public ResponseEntity<LearningRoute> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        LearningRoute learningRoute = learningRouteRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok().body(learningRoute);
    }

    //Post requests
    @PostMapping("/learning-routes")
    public void create (@RequestBody LearningRoute learningRoute) {
        learningRouteRepository.save(learningRoute);
    }

    //Put requests
    @PutMapping("/learning-routes")
    public void edit (@RequestBody LearningRoute learningRoute) {
        learningRouteRepository.save(learningRoute);
    }

    //Delete requests
    @DeleteMapping("/learning-routes/{id}")
    public void delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        LearningRoute learningRoute = learningRouteRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        learningRouteRepository.delete(learningRoute);
    }
}
