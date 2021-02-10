package com.zipkinServer3.zipkin.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.zipkinServer3.zipkin.controller.Zipkin3ServiceController;

public class Utils {
	private static final Logger LOGGER = LoggerFactory.getLogger(Zipkin3ServiceController.class);

	public void addLog(String log) {
		LOGGER.info("LOG [ZIPKIN_3]:" + log);
	}
}
