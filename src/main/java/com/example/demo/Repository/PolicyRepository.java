package com.example.demo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Policy;

public interface PolicyRepository extends MongoRepository<Policy, String>{

}
