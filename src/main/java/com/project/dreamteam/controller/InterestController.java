package com.project.dreamteam.controller;

import com.project.dreamteam.model.Interest;
import com.project.dreamteam.repository.InterestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InterestController {

    @Autowired
    InterestRepository interestRepository;

    // Get all interests
    @GetMapping("/interests")
    public List<Interest> list() {
        return interestRepository.findAll();
    }

    // Get interest by ID
    @GetMapping("/interests/{id}")
    public ResponseEntity<Interest> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        // Find interest by ID in the repository
        Interest interest = interestRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok().body(interest);
    }

    // Get interests by corporation ID
    @GetMapping("/interests/corpid/{corpId}")
    public List<Interest> getByCorpId(@PathVariable(value = "corpId") String corpId)
            throws ResourceNotFoundException {
        // Find interests by corporation ID in the repository
        return interestRepository.getInterestByCorpId(corpId);
    }

    // Create a new interest
    @PostMapping("/interests")
    public void create(@RequestBody Interest interest) {
        // Save the new interest to the repository
        interestRepository.save(interest);
    }

    // Update an existing interest
    @PutMapping("/interests")
    public void edit(@RequestBody Interest interest) {
        // Save the updated interest to the repository
        interestRepository.save(interest);
    }

    // Delete an interest by ID
    @DeleteMapping("/interests/{id}")
    public void delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        // Find interest by ID in the repository
        Interest interest = interestRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        // Delete the interest from the repository
        interestRepository.delete(interest);
    }
}