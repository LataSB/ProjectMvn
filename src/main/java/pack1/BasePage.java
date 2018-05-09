package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;


	public class BasePage
	{
		public static WebDriver driver;
		
		public BasePage(WebDriver driver)
		{
			this.driver=driver;
		}
		
		public static void verifyTitle(String etitle)
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			
			try
			{
				wait.until(ExpectedConditions.titleIs(etitle));
				Reporter.log("title matching",true);	
			}
			catch(Exception e)
			{
				Reporter.log("title not matching",true);
			}
			
		}
		
		
			
		}
		

	

	
}
