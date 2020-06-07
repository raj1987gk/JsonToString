package com.jsontostring.app.service;

import org.springframework.stereotype.Component;

@Component
public class JsonParserService {
	public String parseJson(String jsonObject) {
		String input= jsonObject.replaceAll("\\s", "");
		input = input.replaceAll("\"", "\\\\\"");
		System.err.println(input);
		return "\""+input+"\"";
	}

}
