package com.learn.swagger;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@SuppressWarnings(value = { "unused" })
@RestController
public class SwaggerController {

	@GetMapping("/")
	@ApiOperation(value = "Home page url", notes = "Returns a welcome string")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "operation successfull"),
			@ApiResponse(responseCode = "401", description = "denied"),
	})
	public String home() {
		return "home page";
	}
	
	@GetMapping("/add")
	@ApiOperation(value = "Addition Operation", notes = "It can added two integers")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "operation successfull"),
			@ApiResponse(responseCode = "401", description = "denied"),
	})
	public String home(int a, int b) {
		int c = a + b;
		return String.valueOf("answer : " + c );
	}
	
}
