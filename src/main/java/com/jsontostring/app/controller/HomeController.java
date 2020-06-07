package com.jsontostring.app.controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsontostring.app.service.JsonParserService;

@RestController
public class HomeController {
	private JsonParserService jsonParserService;
	
	public HomeController(JsonParserService jsonParserService) {
	 this.jsonParserService = jsonParserService;	
	}
	
	
	@PostMapping("/parseJson")
	public String parseJson(@RequestBody String jsonString) throws Exception{
		String output;
		if(isValidJson(jsonString)){
			output = jsonParserService.parseJson(jsonString);
		}else {
			output = "Please provide valid Json string";
		}
		System.err.println(output);
		return  output;
	}
	private boolean isValidJson(String jsonString) {
		JSONObject jsonObject = null;
		try {
			System.out.println("Input string: "+jsonString);
			jsonObject = new JSONObject(jsonString);
		} catch (Exception e) {
			System.err.println("exception"+e.getMessage());
			e.printStackTrace();
		}
		return (jsonObject!=null);
	}
}
