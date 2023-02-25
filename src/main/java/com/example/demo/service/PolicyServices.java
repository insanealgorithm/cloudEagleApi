package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PolicyRepository;
import com.example.demo.model.Policy;

@Service
public class PolicyServices {
	
@Autowired
private PolicyRepository policyRepository;

	public Policy saveOrUpdate(Policy p) {
		return policyRepository.save(p);
	}

}
