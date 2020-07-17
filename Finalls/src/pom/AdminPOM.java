package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPOM {
	
	
	@FindBy(id ="menu_admin_viewAdminModule")
	public static WebElement adminclick ;
	
	@FindBy(id = "menu_admin_UserManagement")
	public static WebElement admin_management;
	
	@FindBy(xpath = "//*[@id='menu_admin_viewSystemUsers\']")
	public static WebElement admin_user;

	//select
	
	
	@FindBy(id="searchSystemUser_userType")
	public static WebElement user_Role;                 
	
	@FindBy(id="searchSystemUser_status")
	public static WebElement status_role;
	
	
	@FindBy(id="searchBtn")
	public static WebElement search_btn;
		
	}
	

	
	
	
	

