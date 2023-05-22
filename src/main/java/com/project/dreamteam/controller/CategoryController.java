package com.project.dreamteam.controller;

import com.project.dreamteam.model.Category;
import com.project.dreamteam.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    //Get requests
    @GetMapping("/categories")
    public List<Category> list() {
        return categoryRepository.findAll();
    }

    @GetMapping("/categories/{id}")
    public ResponseEntity<Category> getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        Category category = categoryRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return ResponseEntity.ok().body(category);
    }

    //Post requests
    @PostMapping("/categories")
    public void create (@RequestBody Category category) {
        categoryRepository.save(category);
    }

    //Put requests
    @PutMapping("/categories")
    public void edit (@RequestBody Category category) {
        categoryRepository.save(category);
    }

    //Delete requests
    @DeleteMapping("/categories/{id}")
    public void delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        Category category = categoryRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        categoryRepository.delete(category);
    }
}
