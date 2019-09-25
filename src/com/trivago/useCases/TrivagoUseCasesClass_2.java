package com.trivago.useCases;

import static org.testng.Assert.assertEquals;
import java.util.List;
import com.trivago.utilities.GetAPIProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TrivagoUseCasesClass_2 {
	private Response httpResponse;
	private String tempUrl="";
	
	@Given("^the user submits the API with all category from response$")
	public void the_user_submits_the_API_with_all_category_from_response() throws Throwable {
		TrivagoUseCasesClass_1.httpRequest = RestAssured.given().relaxedHTTPSValidation();
		tempUrl=new GetAPIProperties().getTempUrlforCase2();
	}

	@SuppressWarnings("null")
	@Then("^the result matches the category with request$")
	public void the_result_matches_the_category_with_request() throws Throwable {		
		List<Boolean> testResult = null;
		for(String s:TrivagoUseCasesClass_1.respCategoryList){			
			httpResponse = TrivagoUseCasesClass_1.httpRequest.get(tempUrl+s);			
			String actCat = httpResponse.jsonPath().getString("categories").replace("]","").replace("[","");		
			if(!actCat.equals(s)){
				System.out.println("Not matched -> Actual = "+actCat + " Expected = "+s );
				testResult.add(false);
			}
			Thread.sleep(2000);
		}
		/*if(testResult.contains(false)){
			assertTrue(result);
		}*/		
	}

	@Then("^when the user submits API with invalid category$")
	public void when_the_user_submits_API_with_invalid_category() throws Throwable {
		httpResponse = TrivagoUseCasesClass_1.httpRequest.get(tempUrl+"test");		
	}

	@Then("^the user gets (\\d+) error code$")
	public void the_user_gets_error_code(int resCode) throws Throwable {
	   int statusCode = httpResponse.getStatusCode();
	   assertEquals(statusCode,resCode);
	}
}
