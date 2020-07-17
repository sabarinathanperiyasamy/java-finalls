package testcases;


import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonpack.Commonpack;
import pom.AdminPOM;

public class AdminTC extends Commonpack {
	
	


	@Test()
	public void admin() throws InterruptedException {
		
		PageFactory.initElements(driver,AdminPOM.class);
		
		 admintc();
		
		 search();
		 
		 
	}
	
	
	public static void admintc() {
		
		
	Actions action = new Actions(driver);
		

		
		
		 // action.doubleClick(AdminPOM.adminclick);
		 // action.perform();
		
		action.moveToElement(AdminPOM.adminclick);
		action.moveToElement(AdminPOM.admin_management);
		action.moveToElement(AdminPOM.admin_user).click().build().perform();
	}
	
	public static void search() throws InterruptedException {
		
		
		Select s = new Select(AdminPOM.user_Role);
		s.selectByIndex(1);
		
		Select s1 = new Select(AdminPOM.status_role);
		s1.selectByIndex(1);
		
	    AdminPOM.search_btn.click();
		
		
}
	
	
	
	

}
