package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loaicongty {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/ul[1]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Loại công ty')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("create_new_company_type")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("công ty tư nhân");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();}

//bỏ trống tên loại công ty 
@Test
public void testcase2() {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://dev.solashi.com:2896/");
	driver.findElement(By.linkText("Đăng nhập")).click();
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/ul[1]/div[1]")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[contains(text(),'Loại công ty')]")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("create_new_company_type")).click();
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("");
	driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
	String expected = "Trường loại công ty không được bỏ trống";
	String actual = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
	System.out.println(actual);
	if (expected.equals(actual)) {
		System.out.print("Testcase 2: success");
	} else {
		System.out.print("Testcase 2:  failed");
	}}
	//nhập loại công ty = 257 kí tự 
	@Test
	public void testcase3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[4]/ul[1]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Loại công ty')]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("create_new_company_type")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
		String expected = "Trường loại công ty không được lớn hơn 255 ký tự";
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success");
		} else {
			System.out.print("Testcase 2:  failed");
		}
		
}}





