package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tester.login.Cucumber.Hooks;

public class AccessPage {
	public AccessPage() {
		
		PageFactory.initElements(Hooks.driver, this);
	}

	@FindBy(xpath = "//table//h3")
	private WebElement lbl_custId;

	public WebElement getLbl_custId() {
		return lbl_custId;
	}
	
	
	

}
