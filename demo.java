package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input"))
				.sendKeys("doanhnghiep1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input"))
				.sendKeys("giao dịch 1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();

		// chọn loại doanh nghiệp
		driver.findElement(By.xpath("//li/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input"))
				.sendKeys("0349843272");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input"))
				.sendKeys("doanhnghiep1@solashi.com");

		// chọn tỉnh thành
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[3]/div")).click();

		// chọn quận huyện
		driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();

		// seletc ward
		driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();

		// enter detail address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input"))
				.sendKeys("Nghe an");

		// select register certificate date
		driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
		driver.findElement(By.xpath("//div[12]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		// ngày cấp chứng chỉ
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input"))
				.sendKeys("123456789");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input"))
				.sendKeys("120000");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
		driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
		driver.findElement(By.xpath("//div[121]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input"))
				.sendKeys("10000");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input"))
				.sendKeys("test888");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input"))
				.sendKeys("Xu@n1998");
		driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
		driver.close();
	}
	// bỏ trống tên doanh nghiep
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input"))
				.sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input"))
				.sendKeys("giao dich 1");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
		// chọn loại doanh nghiệp driver.findElement(By.xpath("//li/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input"))
				.sendKeys("0349843271");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input"))
				.sendKeys("doanhnghiep@solashi.com");
		// chọn tỉnh thành
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div"))
				.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[3]/div")).click();

		// chọn quận huyện
		driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();

		// seletc ward
		driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();

		// enter detail address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input"))
				.sendKeys("Nghe an");
		// select register certificate date
		driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
		driver.findElement(By.xpath("//div[12]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		// ngày cấp chứng chỉ
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input"))
				.sendKeys("123456789");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input"))
				.sendKeys("120000");

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input"))
				.click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
		driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
		driver.findElement(By.xpath("//div[121]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input"))
				.sendKeys("10000");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input"))
				.sendKeys("test666");

		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input"))
				.sendKeys("Xu@n1998");

		driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();

		driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
		String expected = "Tên doanh nghiệp không được bỏ trống";
		String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/p")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success");
		} else {
			System.out.print("Testcase 2:  failed");
		}
		driver.close();
	}
	//bỏ trống tên giao dich
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
		// chọn loại doanh nghiệp 
		driver.findElement(By.xpath("//li/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
		// chọn tỉnh thành
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[3]/div")).click();
		// chọn quận huyện
		driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();
		// seletc ward
		driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();
		// enter detail address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
		// select register certificate date
		driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
		driver.findElement(By.xpath("//div[12]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		// ngày cấp chứng chỉ
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
		driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
		driver.findElement(By.xpath("//div[121]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
		driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
		String expected = "Tên giao dịch không được bỏ trống";
		String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/p")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 3: success");
		} else {
			System.out.print("Testcase 3:  failed");
		}
		
	}
	//bỏ trống loại doanh nghiệp
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
		// chọn loại doanh nghiệp
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
		//driver.findElement(By.xpath("//li/div")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
		// chọn tỉnh thành
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[3]/div")).click();
		// chọn quận huyện
		driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();
		// seletc ward
		driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[4]/div")).click();
		// enter detail address
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
		// select register certificate date
		driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
		driver.findElement(By.xpath("//div[12]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		// ngày cấp chứng chỉ
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
		driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
		driver.findElement(By.xpath("//div[121]")).click();
		driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
		driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
		driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
		String expected = "Trường loại doanh nghiệp không được bỏ trống";
		String actual = driver.findElement(By.xpath("//*[@id=\"mui-46439-helper-text\"]")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 3: success");
		} else {
			System.out.print("Testcase 3:  failed");}
		}
		//bỏ trống số điện thoại
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
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường số điện thoại không được bỏ trống.";
			String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success");
			} else {
				System.out.print("Testcase 5:  failed");
			}
	}
		//bỏ trống email
		@Test
		public void testcase6() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường loại doanh nghiệp không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success");
			} else {
				System.out.print("Testcase 5:  failed");
			}
	}
		//bỏ trống tính thành 
		@Test
		public void testcase7() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			//driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			//driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường loại doanh nghiệp không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"mui-42607-helper-text\"]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success");
			} else {
				System.out.print("Testcase 5:  failed");
			}
	}
		//bỏ trống quận huyện
		@Test
		public void testcase8() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			//driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			//driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường loại doanh nghiệp không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"mui-42607-helper-text\"]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success");
			} else {
				System.out.print("Testcase 5:  failed");
			}
	}
		//bỏ trống phường xã 
		@Test
		public void testcase9() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			//driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường phường xã không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"mui-26459-helper-text\"]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 5: success");
			} else {
				System.out.print("Testcase 5:  failed");
			}}
	//bỏ trống địa chỉ cụ thể 
		@Test
		public void testcase10() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường địa chỉ cụ thể không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 10: success");
			} else {
				System.out.print("Testcase 10:  failed");
			}}
		//bỏ trống ngày đăng ký chứng chỉ 
		@Test
		public void testcase11() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			//driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			//driver.findElement(By.xpath("//div[12]")).click();
			//driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường ngày đăng ký chứng chỉ không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[9]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 11: success");
			} else {
				System.out.print("Testcase 11:  failed");
			}}
		//bỏ trống số chứng chỉ 
		@Test
		public void testcase12() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Trường số chứng chỉ không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 12: success");
			} else {
				System.out.print("Testcase 12:  failed");
			}}
		//bỏ trống cán bộ 
		@Test
		public void testcase13() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://dev.solashi.com:2896/");
			driver.findElement(By.linkText("Đăng nhập")).click();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("hieund");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("111111");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[6]/ul/div[2]/div/div/div[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[1]/div/div/div/input")).sendKeys("doanh nghiệp 1");			
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[2]/div/div/div/input")).sendKeys("giao dịch1");
			// chọn loại doanh nghiệp
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[3]/div/div/div/div")).click();
			driver.findElement(By.xpath("//li/div")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[5]/div/div/div/input")).sendKeys("0349843272");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[6]/div/div/div/input")).sendKeys("doanhnghiep@solashi.com");				
			// chọn tỉnh thành
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[7]/div/div/div[1]/div/div/div")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[3]/div")).click();
			// chọn quận huyện
			driver.findElement(By.xpath("//div/div[2]/div/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// seletc ward
			driver.findElement(By.xpath("//div[7]/div/div/div[3]/div/div/div")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//li[4]/div")).click();
			// enter detail address
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[8]/div/div/div/input")).sendKeys("Nghe an");				
			// select register certificate date
			driver.findElement(By.xpath("//div[9]/div/div/div/div/input")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//p[contains(.,'14')]")).click();
			driver.findElement(By.xpath("//div[12]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			// ngày cấp chứng chỉ
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[11]/div/div/div/input")).sendKeys("123456789");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[1]/div/div/input")).sendKeys("120000");
			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div/div[10]/div/div/div/div/input")).click();				
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/div[7]/button/span")).click();
			driver.findElement(By.xpath("//div/div/div/div[2]/div/div[9]")).click();
			driver.findElement(By.xpath("//div[121]")).click();
			driver.findElement(By.xpath("//span[contains(.,'OK')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/div/div[2]/div[2]/div/div/input")).sendKeys("10000");				
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[1]/div/input")).sendKeys("test666");
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[3]/div/div[2]/div/input")).sendKeys("Xu@n1998");			
			//driver.findElement(By.xpath("//div[@id='root']/div/main/div[2]/div[2]/div/div/div/div/div/input")).click();
			//driver.findElement(By.xpath("//li[contains(.,'Thành Công')]")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[5]/button")).click();
			String expected = "Cán bộ phụ trách không được bỏ trống";
			String actual = driver.findElement(By.xpath("//*[@id=\"mui-49709-helper-text\"]")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 13: success");
			} else {
				System.out.print("Testcase 13:  failed");
			}}
		
		
		
}
