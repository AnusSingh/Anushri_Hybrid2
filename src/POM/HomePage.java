package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//div[.='USERS']")
	private WebElement users;
	
	/*@FindBy(id="logoutLink")
	private WebElement logout;*/
	
	
	public HomePage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}

	public void usersLink()
	{
		users.click();
	}
	
	/*public void logoutLink()
	{
		logout.click();
	}*/
}
