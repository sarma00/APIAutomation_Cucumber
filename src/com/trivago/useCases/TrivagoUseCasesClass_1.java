/** Author: Manash Sarma
 * Use Case : Verify status 
 * 
 */

package com.trivago.useCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import com.trivago.utilities.GetAPIProperties;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TrivagoUseCasesClass_1 {
	static public RequestSpecification httpRequest;
	static public List<String> respCategoryList;
	static public int resCategoryCnt;
	private Response httpResponse;
	private int statusCode;
	
	
	
	@Given("^the user calls the valid API endpoint with GET method$")
	public void the_user_calls_the_valid_API_endpoint() throws Throwable {
		httpRequest = RestAssured.given().relaxedHTTPSValidation();	
		httpResponse = httpRequest.get(new GetAPIProperties().getURLforCase1());
	}

	@Then("^the reponse code should be (\\d+)$")
	public void the_reponse_code_should_be(int statusCd) throws Throwable {
		statusCode = httpResponse.getStatusCode();
		assertEquals(statusCode,statusCd);
		System.out.println("Status Code Matched!!!!");	    
	}

	@Then("^the category count should be equal to (\\d+)$")
	public void the_category_count_should_be_equal_to(int resCount) throws Throwable {	    
		respCategoryList = httpResponse.jsonPath().getList("$");		
		resCategoryCnt	 = respCategoryList.size();
		assertEquals(resCount, respCategoryList.size());
	    System.out.println("Category count matched!!!");
	}
}
