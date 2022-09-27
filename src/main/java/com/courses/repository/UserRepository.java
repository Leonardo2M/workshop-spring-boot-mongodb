package com.courses.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.courses.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
