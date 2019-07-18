package org.tester.login.Cucumber;

import java.util.Map;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import objectRepository.AccessPage;
import objectRepository.AddCustomerPage;

public class AddCustomerPageSteps {
@When("the user fill in valid customer details")
public void the_user_fill_in_valid_customer_details(DataTable customerDetails) {
	AddCustomerPage addcust = new AddCustomerPage();

	Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
	addcust.getRdo_done().click();
	addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
	addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
	addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAddress"));
	addcust.getTxt_adress().sendKeys(customerDetailsMap.get("address"));
	addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNumber"));
}
@When("the user clicks the submit button")
public void the_user_clicks_the_submit_button() {
	AddCustomerPage addcust = new AddCustomerPage();
	addcust.getBtn_submit().click();
}

@When("the user fill in valid customer details.")
public void x(DataTable customerDetails) {
	AddCustomerPage addcust = new AddCustomerPage();

	Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
	addcust.getRdo_done().click();
	addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
	addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
	addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAddress"));
	addcust.getTxt_adress().sendKeys(customerDetailsMap.get("address"));
	addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNumber"));
}
@When("the user click reset button.")
public void the_user_click_reset_button() {
	AddCustomerPage addcust = new AddCustomerPage();
	addcust.getClick_reset().click();
}
@Then("all the user details should be deleted.")
public void all_the_user_details_should_be_deleted() {
	AddCustomerPage addcust = new AddCustomerPage();
	Assert.assertTrue(addcust.getCheck().isEnabled());
}

@When("the user has mentioned gmail address wrong notation")
public void the_user_has_mentioned_gmail_address_wrong_notation(DataTable customerDetails) {
		AddCustomerPage addcust = new AddCustomerPage();
		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		addcust.getRdo_done().click();
		addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
		addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
		addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAddress"));
		addcust.getTxt_adress().sendKeys(customerDetailsMap.get("address"));
		addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNumber"));
}
@Then("error message should display stating that email address is wrong.")
public void error_message_should_display_stating_that_email_address_is_wrong() {
	AddCustomerPage addcust = new AddCustomerPage();
	Assert.assertTrue(addcust.getEmail_verify().isDisplayed());
}

@When("the user left last name textbox empty")
public void the_user_left_last_name_textbox_empty(DataTable customerDetails) {
	AddCustomerPage addcust = new AddCustomerPage();
	Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
	addcust.getRdo_done().click();
	addcust.getTxt_fname().sendKeys(customerDetailsMap.get("firstName"));
	addcust.getTxt_lname().sendKeys(customerDetailsMap.get("lastName"));
	addcust.getTxt_email().sendKeys(customerDetailsMap.get("emailAddress"));
	addcust.getTxt_adress().sendKeys(customerDetailsMap.get("address"));
	addcust.getTxt_phnum().sendKeys(customerDetailsMap.get("phoneNumber"));
}
@Then("popup message should display stating that please fill all fields.")
public void popup_message_should_display_stating_that_please_fill_all_fields() {
	AddCustomerPage addcust = new AddCustomerPage();
	Assert.assertTrue(addcust.getText_verify().isDisplayed());
	
}


}