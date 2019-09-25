$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("01_VerifyFullResponse.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author:"
    }
  ],
  "line": 2,
  "name": "Verify the response for API use cases",
  "description": "",
  "id": "verify-the-response-for-api-use-cases",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "## Case 1"
    }
  ],
  "line": 5,
  "name": "Verify the status code and category count",
  "description": "",
  "id": "verify-the-response-for-api-use-cases;verify-the-status-code-and-category-count",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user calls the valid API endpoint with GET method",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the reponse code should be 200",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the category count should be equal to 16",
  "keyword": "And "
});
formatter.match({
  "location": "TrivagoUseCasesClass_1.the_user_calls_the_valid_API_endpoint()"
});
formatter.result({
  "duration": 3812934052,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 27
    }
  ],
  "location": "TrivagoUseCasesClass_1.the_reponse_code_should_be(int)"
});
formatter.result({
  "duration": 5657947,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 38
    }
  ],
  "location": "TrivagoUseCasesClass_1.the_category_count_should_be_equal_to(int)"
});
formatter.result({
  "duration": 213282852,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 10,
      "value": "## Case 2"
    }
  ],
  "line": 11,
  "name": "Verify the response for all the categories",
  "description": "",
  "id": "verify-the-response-for-api-use-cases;verify-the-response-for-all-the-categories",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "the user submits the API with all category from response",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "the result matches the category with request",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "when the user submits API with invalid category",
  "keyword": "But "
});
formatter.step({
  "line": 15,
  "name": "the user gets 404 error code",
  "keyword": "Then "
});
formatter.match({
  "location": "TrivagoUseCasesClass_2.the_user_submits_the_API_with_all_category_from_response()"
});
formatter.result({
  "duration": 2140728,
  "status": "passed"
});
formatter.match({
  "location": "TrivagoUseCasesClass_2.the_result_matches_the_category_with_request()"
});
formatter.result({
  "duration": 6660169877,
  "error_message": "java.lang.NullPointerException\r\n\tat com.trivago.useCases.TrivagoUseCasesClass_2.the_result_matches_the_category_with_request(TrivagoUseCasesClass_2.java:37)\r\n\tat ✽.Then the result matches the category with request(01_VerifyFullResponse.feature:13)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "TrivagoUseCasesClass_2.when_the_user_submits_API_with_invalid_category()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "404",
      "offset": 14
    }
  ],
  "location": "TrivagoUseCasesClass_2.the_user_gets_error_code(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "comments": [
    {
      "line": 17,
      "value": "## Case 3"
    }
  ],
  "line": 18,
  "name": "Verify the value of text in response body",
  "description": "",
  "id": "verify-the-response-for-api-use-cases;verify-the-value-of-text-in-response-body",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "the user submits the API with valid url",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "the user receives a 200 status code",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "the response contains the text \"entire song\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "the icon url is a valid url",
  "keyword": "And "
});
formatter.match({
  "location": "TrivagoUseCasesClass_3.the_user_submits_the_API_with_valid_url()"
});
formatter.result({
  "duration": 1290364437,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 20
    }
  ],
  "location": "TrivagoUseCasesClass_3.the_user_receives_a_status_code(int)"
});
formatter.result({
  "duration": 182770,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "entire song",
      "offset": 32
    }
  ],
  "location": "TrivagoUseCasesClass_3.the_response_contains_the_text(String)"
});
formatter.result({
  "duration": 2523239,
  "status": "passed"
});
formatter.match({
  "location": "TrivagoUseCasesClass_3.the_icon_url_is_a_valid_url()"
});
formatter.result({
  "duration": 991941975,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 24,
      "value": "## Case 4"
    }
  ],
  "line": 26,
  "name": "Verify the status code with invalid url",
  "description": "",
  "id": "verify-the-response-for-api-use-cases;verify-the-status-code-with-invalid-url",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 27,
  "name": "the user submits the API with an invalid url",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "the user receives a 404 error code in the response",
  "keyword": "Then "
});
formatter.match({
  "location": "TrivagoUseCasesClass_4.the_user_submits_the_API_with_an_invalid_url()"
});
formatter.result({
  "duration": 1222304067,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "404",
      "offset": 20
    }
  ],
  "location": "TrivagoUseCasesClass_4.the_user_receives_a_error_code_in_the_response(int)"
});
formatter.result({
  "duration": 257771,
  "status": "passed"
});
});