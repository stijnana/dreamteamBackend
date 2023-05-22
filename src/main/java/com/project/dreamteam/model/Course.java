package com.project.dreamteam.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@AllArgsConstructor

public class Course {
    @Id
    private long id;
    private String name;
    private String category;
    private String description;
    private String location;
    private String duration;
}
