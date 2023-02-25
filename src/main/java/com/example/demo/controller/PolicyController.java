package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Policy;
import com.example.demo.service.PolicyServices;

@RestController
public class PolicyController {

@Autowired
private PolicyServices policyServices;

@PostMapping
public ResponseEntity<Policy> saveOrUpdate(@RequestBody Policy p){
	return new ResponseEntity<Policy>(policyServices.saveOrUpdate(p),HttpStatus.ACCEPTED);
}
}
