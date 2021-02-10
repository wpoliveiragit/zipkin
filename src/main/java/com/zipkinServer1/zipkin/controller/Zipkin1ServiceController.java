package com.zipkinServer1.zipkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zipkinServer1.zipkin.utils.Utils;

@RestController
public class Zipkin1ServiceController extends Utils {

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	@GetMapping("/zipkin1")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<String> getZipkin() {
		String[] resp = new String[] { "" , "" };
		resp[0] = restTemplate.getForObject(URL_ZIPKIN_2, String.class);
		super.addLog("Resposta da mensagem enviada a ZIPKIN_2:" + resp[0]);
		resp[1] = restTemplate.getForObject(URL_ZIPKIN_3, String.class);
		super.addLog("Resposta da mensagem enviada a ZIPKIN_3:" + resp[1]);
		return new ResponseEntity<String>(resp[0] + "-" + resp[1], HttpStatus.OK);
	}

}
