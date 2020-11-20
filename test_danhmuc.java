package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_danhmuc {
	//case dung
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
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div[2]/div/div/div[1]/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("danh mục mới");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
	}
	//bo trong ten danh muc
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
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div[2]/div/div/div[1]/div[2]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys(" ");
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
			String expected = "Trường tài khoản không được bỏ trống.";
			String actual = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
			System.out.println(actual);
			if (expected.equals(actual)) {
				System.out.print("Testcase 2: success");
			} else {
				System.out.print("Testcase 2:  failed");
			}}
			//nhap ten danh muc cos trong CSDL 
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
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div[2]/div/div/div[1]/div[2]/span")).click();
				driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys(" ");
				driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
				String expected = "Trường danh mục đã có trong CSDL.";
				String actual = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
				System.out.println(actual);
				if (expected.equals(actual)) {
					System.out.print("Testcase 2: success");
				} else {
					System.out.print("Testcase 2:  failed");
				}}
			//nhập tên danh mục = 257 kí tự 
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
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div")).click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[5]/ul/div[2]/div/div/div[1]/div[2]/span")).click();
					driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
					driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
					String expected = "Trường danh mục có nhiều nhất 255 kí tự.";
					String actual = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div[1]/div/div/div/p")).getText();
					System.out.println(actual);
					if (expected.equals(actual)) {
						System.out.print("Testcase 2: success");
					} else {
						System.out.print("Testcase 2:  failed");
					}
			

}}
