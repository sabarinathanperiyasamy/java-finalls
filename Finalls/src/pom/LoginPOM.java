package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM {
	
	
	

	@FindBy(id = "txtUsername")
	public static WebElement  UserName ;
	
	@FindBy(id = "txtPassword")
	public static WebElement  Password ;
	
	@FindBy(id = "btnLogin")
	public static WebElement submit ;


}
