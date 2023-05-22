package com.project.dreamteam.controller;
import com.project.dreamteam.model.User;
import com.project.dreamteam.model.Wish;
import com.project.dreamteam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    //Get requests
    @GetMapping("/users")
    public List<User> list() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        return user;
    }

    //Post requests
    @PostMapping("/users")
    public String create (@RequestBody User user) {
        userRepository.save(user);
        return "Created successfully";
    }

    //Put requests
    @PutMapping("/users")
    public String edit (@RequestBody User user) {
        userRepository.save(user);
        return "Edited successfully";
    }

    //Delete requests
    @DeleteMapping("/users/{id}")
    public String delete(@PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        User user = userRepository.findById(id)
                .orElseThrow(ResourceNotFoundException::new);
        userRepository.delete(user);
        return "Deleted successfully";
    }

}