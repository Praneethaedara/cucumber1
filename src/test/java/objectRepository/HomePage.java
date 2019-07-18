package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tester.login.Cucumber.Hooks;

public class HomePage {
public HomePage() {
	
	PageFactory.initElements(Hooks.driver, this);
}
	@FindBy(xpath = "(//a[text()='Add Customer'])[1]")
	private WebElement lik_addCustomer;
	@FindBy(xpath = "//a[text()='Add Tariff Plan']")
	private WebElement lnk_addTariffPlan;

	/*
	 * @FindBy(xpath = "//a[text()='Add Tariff Plan to Customer']") private
	 * WebElement lnk_addTariffPlantocust;
	 * 
	 * @FindBy(xpath = "//a[text()='Pay Billing']") private WebElement
	 * lnk_paybilling;
	 */
	public WebElement getLik_addCustomer() {
		return lik_addCustomer;
	}
	public WebElement getLnk_addTariffPlan() {
		return lnk_addTariffPlan;
	}
	/*
	 * public WebElement getLnk_addTariffPlantocust() { return
	 * lnk_addTariffPlantocust; } public WebElement getLnk_paybilling() { return
	 * lnk_paybilling; }
	 */
	
}

