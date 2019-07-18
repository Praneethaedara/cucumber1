package org.tester.login.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.AccessPage;
import objectRepository.AddTariffPlanPage;

public class AddTariffPlanSteps {
	public static WebDriver driver;

	@When("the user fill in valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fill_in_valid_tariff_plan_details(String string, String string2, String string3,
			String string4, String string5, String string6, String string7) {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		addtarif.getMonthRent().sendKeys(string);
		addtarif.getFreeloc_min().sendKeys(string2);
		addtarif.getFreeinter_min().sendKeys(string3);
		addtarif.getFreesms().sendKeys(string4);
		addtarif.getLocalmin_char().sendKeys(string5);
		addtarif.getInt_char().sendKeys(string6);
		addtarif.getSms_char().sendKeys(string7);
	}

	@When("the user clicks submit button")
	public void the_user_clicks_submit_button() {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		addtarif.getBtn_submit().click();

	}

	@Then("the user should see the sucess message")
	public void the_user_should_see_the_sucess_message() {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		Assert.assertTrue(addtarif.getCngrts().isDisplayed());
	}

	@When("the user fills in valid tariff plan details {string},{string},{string},{string},{string},{string},{string}")
	public void the_user_fills_in_valid_tariff_plan_details(String string, String string2, String string3,
			String string4, String string5, String string6, String string7) {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		addtarif.getMonthRent().sendKeys(string);
		addtarif.getFreeloc_min().sendKeys(string2);
		addtarif.getFreeinter_min().sendKeys(string3);
		addtarif.getFreesms().sendKeys(string4);
		addtarif.getLocalmin_char().sendKeys(string5);
		addtarif.getInt_char().sendKeys(string6);
		addtarif.getSms_char().sendKeys(string7);

	}

	/*
	 * @When("the user click submit button") public void
	 * the_user_click_submit_button() throws InterruptedException {
	 * AddTariffPlanPage addtarif = new AddTariffPlanPage();
	 * addtarif.getBtn_submit().click(); Alert a=driver.switchTo().alert();
	 * a.accept();
	 * }
	 */
	@Then("should get popup message displayed like fill all fields")
	public void should_get_popup_message_displayed_like_fill_all_fields() {
		AddTariffPlanPage addtarif = new AddTariffPlanPage();
		Assert.assertTrue(addtarif.getCheck().isDisplayed());
	}

}
