package com.project.dreamteam.controller;

import com.project.dreamteam.model.Wish;
import com.project.dreamteam.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class WishController {
    @Autowired
    WishRepository wishRepository;

    //Get requests
    @GetMapping("/wishes")
    public List<Wish> list() {
        return wishRepository.findAll();
    }

    @GetMapping("/wishes/{id}")
    public ResponseEntity<Wish> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Wish wish = wishRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok().body(wish);
    }

    // Get wish by ID
    @GetMapping("/wishes/corpid/{corpId}")
    public List<Wish> getByCorpId(@PathVariable(value = "corpId") String corpId)
            throws ResourceNotFoundException {
        // Find wish by corporation ID in the repository
        return wishRepository.getWishByCorpId(corpId);
    }

    //Post requests
    @PostMapping("/wishes")
    public void create (@RequestBody Wish wish) {
         wishRepository.save(wish);
    }

    //Put requests
    @PutMapping("/wishes")
    public void edit (@RequestBody Wish wish) {
        wishRepository.save(wish);
    }

    //Delete requests
    @DeleteMapping("/wishes/{id}")
    public void delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Wish wish = wishRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        wishRepository.delete(wish);
    }


}
