package com.zipkinServer1.zipkin.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zipkinServer1.zipkin.controller.Zipkin1ServiceController;

public class Utils {

	private static final Logger LOGGER = LoggerFactory.getLogger(Zipkin1ServiceController.class);
	public static final String URL_ZIPKIN_2 = "http://localhost:8082/zipkin2";
	public static final String URL_ZIPKIN_3 = "http://localhost:8083/zipkin3";

	public static final String MSG = "[MENSAGEM ZIPKIN_2]:";

	public void addLog(String log) {
		LOGGER.info("LOG [ZIPKIN_1]:" + log);
	}
}
