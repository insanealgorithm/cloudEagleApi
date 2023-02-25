package com.example.demo.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import org.springframework.http.HttpHeaders;

@Service
public class ServiceLayer {

	private final RestTemplate restTemplate;

	@Autowired
	public ServiceLayer(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	

	public String fetchData(String partnerId, String partnerSecret) {
		String url = "https://integrations.expensify.com/Integration-Server/ExpensifyIntegrations?";
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
		// headers.set("Authorization", "Basic " +
		// Base64.getEncoder().encodeToString(("partnerID:" + partnerId).getBytes()));
		// headers.set("Authorization", "Basic " +
		// Base64.getEncoder().encodeToString(("partnerSecret:" +
		// partnerSecret).getBytes()));
		String requestBody = "requestJobDescription="
				+ "{\"type\":\"get\",\"credentials\":{\"partnerUserID\":\"aa_surajkadam9892_gmail_com\",\"partnerUserSecret\":\"e12d5245a1d52edc9b5a575d4d1c5a4ef1d97096\"},\"inputSettings\":{\"type\":\"policy\",\"fields\":[\"tax\"],\"policyIDList\":[\"BC84E3A12D5FBD6E\"]}}";
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,
				new HttpEntity<>(requestBody, headers), String.class);
		return response.getBody();
		//String policy = response.getBody();
		//policyDataRepository.saveAll(policy);
	}

}
