import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Given;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GlueCode {


	@Given("^the service is running$")
	public void the_service_is_running() {
		expect().statusCode(200).when().get("/greeting");
	}


	@When("^I submit the correct parameters to the service$")
	public void i_submit_the_correct_parameters_to_the_service() throws Throwable {
	    expect().body("content", equalTo("Hello Eliza Mae!")).when().get("/greeting?name=Eliza Mae");
	} 

	@Then("^I receive the expected output$")
	public void i_receive_the_expected_output() throws Throwable {
		expect().body("content", equalTo("Hello bubblebutt!")).when().get("/greeting?name=bubblebutt");
	}

}