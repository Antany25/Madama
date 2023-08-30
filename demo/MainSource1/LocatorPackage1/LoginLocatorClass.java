package LocatorPackage1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocatorClass {
	
	@FindBy(xpath="//input[@id='username']")
	public WebElement userId;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement pass;
}
