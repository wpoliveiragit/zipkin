package com.zipkinServer2.zipkin.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zipkinServer2.zipkin.controller.Zipkin2ServiceController;

public class Utils {
	private static final Logger LOGGER = LoggerFactory.getLogger(Zipkin2ServiceController.class);
	public static final String URL_ZIPKIN_3 = "http://localhost:8083/zipkin3";

	public void addLog(String log) {
		LOGGER.info("LOG [ZIPKIN_2]:" + log);
	}
}
