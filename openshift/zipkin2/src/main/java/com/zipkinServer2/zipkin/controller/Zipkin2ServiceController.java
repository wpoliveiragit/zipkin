package com.zipkinServer2.zipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zipkinServer2.zipkin.utils.Utils;

@RestController
public class Zipkin2ServiceController extends Utils {

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/zipkin2")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getzipkin() {
		String resp = restTemplate.getForObject(URL_ZIPKIN_3, String.class);
		super.addLog("resposta da mensagem enviada a ZIPKIN_3:" + resp);
		return new ResponseEntity<String>(resp, HttpStatus.OK);
	}

}
