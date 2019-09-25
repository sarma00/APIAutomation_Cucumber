package com.trivago.useCases;

import static org.testng.Assert.assertEquals;

import com.trivago.utilities.GetAPIProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TrivagoUseCasesClass_3 {
	private Response httpResponse;	
	
	@Given("^the user submits the API with valid url$")
	public void the_user_submits_the_API_with_valid_url() throws Throwable {
		TrivagoUseCasesClass_1.httpRequest =  RestAssured.given().relaxedHTTPSValidation();
		httpResponse = TrivagoUseCasesClass_1.httpRequest.get(new GetAPIProperties().getURLforCase3());
	}

	@When("^the user receives a (\\d+) status code$")
	public void the_user_receives_a_status_code(int statusCode) throws Throwable {
	   assertEquals(httpResponse.statusCode(),statusCode);
	}

	@Then("^the response contains the text \"([^\"]*)\"$")
	public void the_response_contains_the_text(String expText) throws Throwable {
	    String actText = httpResponse.body().asString();
	    if(actText.contains(expText)){
	    	System.out.println("passed");
	    }
	}

	@Then("^the icon url is a valid url$")
	public void the_icon_url_is_a_valid_url() throws Throwable {
	    String imgUrl = httpResponse.jsonPath().getString("url");
	    httpResponse = TrivagoUseCasesClass_1.httpRequest.get(imgUrl);
	    assertEquals(200, httpResponse.statusCode());
	}

}
