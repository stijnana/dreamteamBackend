package com.project.dreamteam.model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Import;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Getter
@Setter
@AllArgsConstructor
public class LearningRoute {
    @Id
    private long id;
    private String name;
    private String description;
    private long length;
    private List<Long> courses_id;
}
