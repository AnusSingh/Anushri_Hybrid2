package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage {
	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastname;
	
	@FindBy(name="email")
	private WebElement email;
	
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement tpassword;
	
	@FindBy(name="passwordCopy")
	private WebElement passwordCopy;
	
	@FindBy(xpath="//span[.='Create User']")
	private WebElement createuser;
	
	
	public AddUserPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}

	public void firstnametxtbox(String name)
	{
		firstname.sendKeys(name);
	}
	
	
	public void lastnametxtbox(String name)
	{
		lastname.sendKeys(name);
	}
	
	public void emailtxtbox(String name)
	{
		email.sendKeys(name);
	}
	
	public void usernametextbox(String name)
	{
		username.sendKeys(name);
	}
	
	public void pwdtxtbox(String pswd)
	{
		tpassword.sendKeys(pswd);
	}
	
	public void pwdcpytxtbox(String pswd)
	{
		passwordCopy.sendKeys(pswd);
	}
	public void createuserButton()
	{
		createuser.click();
	}
	
}


