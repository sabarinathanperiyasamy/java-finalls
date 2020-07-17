package testcases;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
	
import commonpack.Commonpack;
import pom.LoginPOM;

public class LoginTC extends Commonpack {
	
	@Test(priority = 2)
	public void login() throws IOException {
		
	 PageFactory.initElements(driver,LoginPOM.class);
	 
	 LoginPOM.UserName.sendKeys(pack1().getProperty("username"));
	 LoginPOM.Password.sendKeys(pack1().getProperty("password"));
	 LoginPOM.submit.click();
	 
	} 

		@Test(priority = 1)
		public void login1() throws IOException {
			
		 PageFactory.initElements(driver,LoginPOM.class);
		 
		 LoginPOM.UserName.sendKeys(pack1().getProperty("username1"));
		 LoginPOM.Password.sendKeys(pack1().getProperty("password"));
		 LoginPOM.submit.click();
	 
		} 
	
}
