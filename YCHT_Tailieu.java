package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YCHT_Tailieu {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("company");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/button[1]")).click();
		driver.findElement(By.xpath("//span[contains(.,'Thêm mới yêu cầu hỗ trợ tài liệu')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id=\"demo-simple-select-placeholder-label\"]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Quý 2')]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div/div[3]/div[1]/table/tbody/tr/td[7]/svg")).click();


}}
