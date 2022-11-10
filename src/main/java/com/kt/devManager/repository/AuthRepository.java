package com.kt.devManager.repository;

import com.kt.devManager.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthRepository extends MongoRepository<User, Long> {
    @Query("SELECT * FROM USER WHERE username = :username AND password = :password")
    List<User> authenticate(
            @Param("username") String username,
            @Param("password") String password
    );
}
