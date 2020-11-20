package DEMO_TEST;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST1 {
	WebDriver driver;
	 @Test()
	 public void testcase1() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();  
	 //vào 1 trang web 
	 driver.get("http://dev.solashi.com:2896/");
	 //in ra title của trang web 
	 System.out.println("URL = "+ driver.getCurrentUrl());
	 String expectedTitle ="QHTVLNN";
	String actualTitle = "";
	 actualTitle = driver.getTitle();
	 System.out.println("Title = "+ driver.getTitle());
	 
		if(actualTitle.contentEquals(expectedTitle)) {
			 System.out.println("Test pass");
		 }
		else {
			System.out.println("Test fail");
		}
		driver.close();

	 
	 
	 }}