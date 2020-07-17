package testcases;




import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonpack.Commonpack;
import pom.DictonaryPOM;

public class Dictionary extends Commonpack {
	
	@Test()
	public void dictionatyTestcase()  {
	
	
	PageFactory.initElements(driver, DictonaryPOM.class);
	
	DictonaryPOM.dictionary.click();
	
	
	
	
	
	//WebElement wb = driver.findElement(By.xpath("//*[@id='task-list-group-panel-menu_holder']//following::td[1]"));
	//String s = wb.getText();
	//Assert.assertEquals(s, "No Records are Available");
	

	
	}

}
