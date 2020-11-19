package com.example.Datalite.repository;

import com.example.Datalite.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String > {
}
