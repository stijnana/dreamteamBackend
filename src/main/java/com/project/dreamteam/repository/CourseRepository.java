package com.project.dreamteam.repository;
import com.project.dreamteam.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, Long> {
}
