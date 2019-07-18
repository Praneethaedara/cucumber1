package org.tester.login.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import objectRepository.AccessPage;

public class AccessPageSteps {
	 WebDriver driver;
	@Then("the user should see the customer id generated")
	public void the_user_should_see_the_customer_id_generated() {
		AccessPage access = new AccessPage();
		Assert.assertTrue(access.getLbl_custId().isDisplayed());
	}
	
	
	
	
	
}
