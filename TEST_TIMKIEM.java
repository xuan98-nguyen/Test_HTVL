package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_TIMKIEM {WebDriver driver;

@Test
public void testcase1() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://dev.solashi.com:2896/");
	driver.findElement(By.linkText("Đăng nhập")).click();
	driver.findElement(By.id("username")).sendKeys("hieund");
	driver.findElement(By.id("password")).sendKeys("111111");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.className("jss83")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.className("jss115")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.className("jss117")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement search = driver.findElement(By.xpath("//button[contains(@title,'Tìm kiếm')]"));
	search.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("search_user_name")).sendKeys("xxxx");
	driver.findElement(By.id("search")).click();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	//System.out.print(actual);
//	String expected = "Không có dữ liệu";
//	if (expected.equals(actual)) {
//		System.out.print("Test success");
//	} else {
//		System.out.print("test fail");
//	}

}
@Test
public void testcase2() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://dev.solashi.com:2896/");
	driver.findElement(By.linkText("Đăng nhập")).click();
	driver.findElement(By.id("username")).sendKeys("hieund");
	driver.findElement(By.id("password")).sendKeys("111111");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.className("jss83")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.className("jss115")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.className("jss117")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement search = driver.findElement(By.xpath("//button[contains(@title,'Tìm kiếm')]"));
	search.click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("search_user_name")).sendKeys("THÀNH CÔNG");
	driver.findElement(By.id("search")).click();
	driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
}}


