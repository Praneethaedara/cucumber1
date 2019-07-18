package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.tester.login.Cucumber.Hooks;

public class AddCustomerPage {
public AddCustomerPage() {
	
	PageFactory.initElements(Hooks.driver,this);
}
@FindBy(xpath = "//label[text()='Done']")
private WebElement rdo_done;
@FindBy(id = "fname")
private WebElement txt_fname;

@FindBy(id = "lname")
private WebElement txt_lname;

@FindBy(id = "email")
private WebElement txt_email;

@FindBy(name = "addr")
private WebElement txt_adress;

@FindBy(name = "telephoneno")
private WebElement txt_phnum;

@FindBy(name = "submit")
private WebElement btn_submit;

public WebElement getRdo_done() {
	return rdo_done;
}

public WebElement getTxt_fname() {
	return txt_fname;
}

public WebElement getTxt_lname() {
	return txt_lname;
}

public WebElement getTxt_email() {
	return txt_email;
}

public WebElement getTxt_adress() {
	return txt_adress;
}

public WebElement getTxt_phnum() {
	return txt_phnum;
}

public WebElement getBtn_submit() {
	return btn_submit;
}
@FindBy(xpath="//input[@type='reset']")
private WebElement click_reset;

public WebElement getClick_reset() {
	return click_reset;
} 
@FindBy(xpath = "//label[text()='Done']")
private WebElement check;

public WebElement getCheck() {
	return check;
}

@FindBy(xpath="//label[text()='Email-ID is not valid']")
private WebElement email_verify;

public WebElement getEmail_verify() {
	return email_verify;
}
@FindBy(xpath="//label[text()='Mobile no must not be blank']")
private WebElement text_verify;

public WebElement getText_verify() {
	return text_verify;
}


}
