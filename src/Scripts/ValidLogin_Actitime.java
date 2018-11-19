package Scripts;

import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
import POM.UserListPage;
import generic.Basetest;
import generic.Excel;
import generic.Property;

public class ValidLogin_Actitime extends Basetest{
	
	@Test
	public void Login(){
		
		LoginPage lp=new LoginPage(driver);
		   //Login Page
	    
	    //String name=Property.getPropertyData(propertyfilepath,"USERNAME");
		String us=Excel.getdata(excelpath,"Sheet1",1,0);
	    //lp.usernametxtbox(name);
	//	thread.sleep(2000);
	    lp.usernametxtbox(us);
	    //String pwd=Property.getPropertyData(propertyfilepath,"PASSWORD");
	    String pwd=Excel.getdata(excelpath,"Sheet1",1,1);
	    lp.passwordtxtbox(pwd);
	    lp.LoginButton();
	    
	  //Home Page
	    HomePage hp=new HomePage(driver);
	    System.out.println("Login page initiated123654");
	    hp.usersLink();
	    
	  //UserList Page
	    UserListPage ulp=new UserListPage(driver);
	    System.out.println("Login page initiated1111");
	    ulp.AdduserBtn();    
		
	}
	
    
    
    
   
   

}
