package com.kt.devManager.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Builder
@Document(collection = "User")
//@Table(name = "TB_USER")
@Data
public class User {
    @Id
    protected long id;

    private String username;
    private String password;

    private String name;
    private Integer age;

    private String authToken;

    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime updatedAt;
}
