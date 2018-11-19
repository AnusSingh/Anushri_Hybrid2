package POM;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//div[.='Add User']")
	private WebElement Adduser;

   
	public UserListPage(WebDriver driver)
	{
	
	PageFactory.initElements(driver, this);
	}

	public void AdduserBtn()
	{
		Adduser.click();
	}

}
