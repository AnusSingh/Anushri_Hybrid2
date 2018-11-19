package Scripts;

import generic.Basetest;
import generic.Excel;

import org.testng.annotations.Test;

import POM.LoginPage;

public class InvalidLogin_Actitime extends Basetest {

	@Test
	public void Login(){
		
		LoginPage lp=new LoginPage(driver);
		   //Login Page
	    //String name=Excel.getdata(excelpath,"Sheet1",1,0);
	   // lp.usernametxtbox(name);
	    //String pwd=Excel.getdata(excelpath,"Sheet1",1,1);
	   // lp.passwordtxtbox(pwd);

	    lp.LoginButton();
}
}
