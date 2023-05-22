package com.project.dreamteam.repository;
import com.project.dreamteam.model.Category;;
import org.springframework.data.mongodb.repository.*;

public interface CategoryRepository extends MongoRepository<Category, Long> {
}

