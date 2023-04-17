package com.project.dreamteam.repository;
import com.project.dreamteam.model.User;
import org.springframework.data.mongodb.repository.*;
public interface UserRepository extends MongoRepository<User, Integer> {
}