package com.zipkinServer3.zipkin.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zipkinServer3.zipkin.utils.Utils;

@RestController
public class Zipkin3ServiceController extends Utils {

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/zipkin3")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getZipkin() {
		super.addLog ("Zipkin 3 acessado");
		return new ResponseEntity<String>("Zipkin 3 acessado", HttpStatus.OK);
	}

}
