package org.tester.login.Cucumber;

import cucumber.api.java.en.Given;
import objectRepository.HomePage;

public class HomePageSteps {
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
		HomePage home = new HomePage();
	    home.getLik_addCustomer().click();
	    
	}
	@Given("the user is in add tariff plan page")
	public void the_user_is_in_add_tariff_plan_page() {
		HomePage home = new HomePage();
		home.getLnk_addTariffPlan().click();
	}
}
