package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quyettoantheonguoilaodong {
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
		driver.findElement(By.xpath("//*[@id=\"simple-popover\"]/div[3]/ul/div[2]")).click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/table/tbody/tr[1]/td[7]")).click();
		driver.findElement(By.xpath("//td[6]/div/div/div/input")).click();
		driver.findElement(By.xpath("//p[contains(.,'13')]")).click();
		driver.findElement(By.xpath("//div[11]")).click();
		driver.findElement(By.xpath("//div[121]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/div/div/input")).sendKeys("nguyên văn an");
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[3]/div/table/tbody/tr[2]/td[2]/div/div/input")).sendKeys("nguyên văn an");
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[3]/div/table/tbody/tr[2]/td[3]/div/div/input")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[3]/div/table/tbody/tr[2]/td[4]/div/div/input")).sendKeys("187636083");
		driver.findElement(By.xpath("//*[@id='root']/div/main/div[2]/div[3]/div/table/tbody/tr[2]/td[5]/div/div/div/div/button[2]")).click();
		driver.findElement(By.xpath("//li[2]/div")).click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		WebElement button = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/button/span[1]"));
		button.click();
		//chọn quý 
		driver.findElement(By.xpath("//*[@id=\"demo-controlled-open-select\"]")).click();
		driver.findElement(By.xpath("//body")).click();
		driver.findElement(By.xpath("//li[contains(.,'Quý 1')]")).click();
		// chọn năm 
		//driver.findElement(By.xpath("//body")).click();
		//driver.findElement(By.xpath("//li[contains(.,'2015')]")).click();
		//nhập tiền 
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div[2]/table/tbody/tr[9]/td[2]/div/div/input")).sendKeys("100000");
		// click luu quyeets toans 
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div[1]/button[1]")).click();

}}
