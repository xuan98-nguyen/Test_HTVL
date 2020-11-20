package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_DONVIHANHCHINH {
	WebDriver driver;

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
		driver.findElement(By.xpath("//span[contains(text(),'Đơn vị hành chính')]")).click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.className("MuiButton-contained")).click();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/input")).sendKeys("test_đơn vị hành chính");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/regions";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Test success");
		} else {
			System.out.print("Test failed");
		}
		driver.close();}
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
		driver.findElement(By.xpath("//span[contains(text(),'Đơn vị hành chính')]")).click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.findElement(By.className("MuiButton-contained")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/input")).sendKeys("test_đơn vị hành chính");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
		String expected = "Trường cấp bậc không được bỏ trống.";
		String actual = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success\n");
		} else {
			System.out.print("Testcase 2:  failed\n");
		}
		driver.close();}
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
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đơn vị hành chính')]")).click();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.className("MuiButton-contained")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/input")).sendKeys("test_đơn vị hành chính");
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
			String expected = "Trường tên đơn vị không được bỏ trống.";
			String actual = driver.findElement(By.xpath("//p[contains(text(),'Trường tên đơn vị không được bỏ trống.')]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 3: success\n");
			} else {
				System.out.print("Testcase 3:  failed\n");
			}
			driver.close();}
	@Test
	public void testcase4() {
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
			driver.findElement(By.xpath("//span[contains(text(),'Đơn vị hành chính')]")).click();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.className("MuiButton-contained")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/input")).sendKeys("Hà giang");
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
			String expected = "Trường tên đơn vị đã có trong cơ sở dữ liệu.";
			String actual = driver.findElement(By.xpath("//p[contains(text(),'Trường tên đơn vị đã có trong cơ sở dữ liệu.')]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 4: success\n");
			} else {
				System.out.print("Testcase 4:  failed\n");
			}
			driver.close();}
	@Test
	public void testcase5() {
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
			driver.findElement(By.xpath("//span[contains(text(),'Đơn vị hành chính')]")).click();
			driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
			driver.findElement(By.className("MuiButton-contained")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//body/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"menu-\"]/div[3]/ul/li[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/div/input")).sendKeys("Hà giang");
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
			String expected = "Trường tên đơn vị không được lớn hơn 255 ký tự.";
			String actual = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div[2]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success\n");
			} else {
				System.out.print("Testcase 5:  failed\n");
			}
			driver.close();}
		
		
}


