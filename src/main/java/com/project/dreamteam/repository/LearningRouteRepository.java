package com.project.dreamteam.repository;

import com.project.dreamteam.model.LearningRoute;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface LearningRouteRepository extends MongoRepository<LearningRoute, Long>{

}
