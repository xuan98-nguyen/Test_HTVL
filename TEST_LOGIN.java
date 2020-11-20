package DEMO_TEST;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_LOGIN {
	WebDriver driver;

	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/form[2]/div/div[4]/button/span[1]")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		// System.out.println(driver.getTitle());
		// String expectedTitle = "QHTVLNN";
		// String actualTitle = driver.getTitle();
		// Assert.assertEquals(expectedTitle,actualTitle);
		driver.close();
	}
	// case bỏ trống username
	@Test
	public void testcase2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		String expected = "Tên đăng nhập là trường bắt buộc";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success\n");
		} else {
			System.out.print("Testcase 2: failed\n");
		}
		driver.close();
	}
	//case bỏ trống mật khẩu
	@Test
	public void testcase3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.className("jss83")).click();
		String expected = "Mật khẩu là trường bắt buộc";
		String actual = driver.findElement(By.id("password-helper-text")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 3: success\n");
		} else {
			System.out.print("Testcase 3: failed\n");
		}
		driver.close();
	}
	// case nhập tài khoản k tồn tại
	@Test
	public void testcase4() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("gfffhfh");
		driver.findElement(By.id("password")).sendKeys("65775");
		driver.findElement(By.className("jss83")).click();
		String expected = "*Sai tài khoản hoặc mật khẩu";
		String actual = driver.findElement(By.className("MuiGrid-root")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 4: success\n");
		} else {
			System.out.print("Testcase 4: failed\n");
		}
		driver.close();}
	//case nhập mật khẩu = các space 
	@Test
	public void testcase5() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("      ");
		driver.findElement(By.className("jss83")).click();
		String expected = "*Sai tài khoản hoặc mật khẩu";
		String actual = driver.findElement(By.className("MuiGrid-root")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 5: success\n");
		} else {
			System.out.print("Testcase 5: failed\n");
		}
		driver.close();}
	//case nhập username = các space 
	@Test
	public void testcase6() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// vào 1 trang web
		driver.get("http://dev.solashi.com:2896/");
		// click vào link login
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("                 ");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("MuiFormHelperText-root")).click();
		String expected = "*Sai tài khoản hoặc mật khẩu";
		String actual = driver.findElement(By.className("MuiGrid-root")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 6: success\n");
		} else {
			System.out.print("Testcase 6: failed\n");
		}
		driver.close();
		}
	}



