package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_phongban {
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/ul/div[2]/div/div/div[3]/div[2]/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/ul/div[2]/div/div/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("phòng đào tạo");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='jss148']/div[2]/button/span[contains(text(), 'Thêm mới')]")).click();
	}
	
	//bỏ trống phòng ban
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
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/ul/div[2]/div/div/div[3]/div[2]/span")).click();
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[4]/ul/div[2]/div/div/div[3]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys(" ");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='jss148']/div[2]/button/span[contains(text(), 'Thêm mới')]")).click();
		String expected = "Trường tên phòng ban không được bỏ trống";
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success");
		} else {
			System.out.print("Testcase 2:  failed");
		}
		

}}



