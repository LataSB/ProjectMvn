package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


	public class BaseTest implements AutoConst 
	{
		public static WebDriver driver;
		
		@BeforeMethod
		public static void preCondition()
		{
			System.setProperty(key,value);
			driver=new ChromeDriver();
			driver.get("");
		}
		
		@AfterMethod
		public static void postCondition()
		{
			driver.close();
		}
		
//gdgfjdfhkfgjkfjgl

}
