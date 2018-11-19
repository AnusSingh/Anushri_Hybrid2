package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement password;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement siginbtn;
	
	public LoginPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}

	public void usernametxtbox(String name1)
	{
		username.sendKeys(name1);
	}
	
	public void passwordtxtbox(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void LoginButton()
	{
		siginbtn.click();
	}
	
}
