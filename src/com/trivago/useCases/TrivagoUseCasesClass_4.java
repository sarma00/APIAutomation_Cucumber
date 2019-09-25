package com.trivago.useCases;

import static org.testng.Assert.assertEquals;

import com.trivago.utilities.GetAPIProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TrivagoUseCasesClass_4 {
	private Response httpResponse;
	
	@Given("^the user submits the API with an invalid url$")
	public void the_user_submits_the_API_with_an_invalid_url() throws Throwable {
		TrivagoUseCasesClass_1.httpRequest =  RestAssured.given().relaxedHTTPSValidation();
		httpResponse = TrivagoUseCasesClass_1.httpRequest.get(new GetAPIProperties().getURLforCase4()); 
	}

	@Then("^the user receives a (\\d+) error code in the response$")
	public void the_user_receives_a_error_code_in_the_response(int expStatusCd) throws Throwable {
	    int actStatusCd = httpResponse.statusCode();
	    assertEquals(actStatusCd, expStatusCd);
	}
}
