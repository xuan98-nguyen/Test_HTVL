package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quyettoan {
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test8888");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Xu@n1998");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/button[1]")).click();
		// click vào quyết toán theo thu nhập
		driver.findElement(By.xpath("//*[@id=\"simple-popover\"]/div[3]/ul/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement debt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[3]/td[2]/p/span[1]"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[4]/td[2]/div/div/input")).sendKeys("120");		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[7]/td[2]/div/div/input")).sendKeys("11");
		System.out.print(debt.getAttribute("innerHTML"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/button[2]")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/settlement";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Test success");
		} else {
			System.out.print("Test failed");
		}
		driver.close();

	}
	@Test
	public void testcase2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test8888");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Xu@n1998");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/button[1]")).click();
		// click vào quyết toán theo thu nhập
		driver.findElement(By.xpath("//*[@id=\"simple-popover\"]/div[3]/ul/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement debt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[3]/td[2]/p/span[1]"));
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[4]/td[2]/div/div/input")).sendKeys("120");		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[7]/td[2]/div/div/input")).sendKeys("11");
		System.out.print(debt.getAttribute("innerHTML"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/button[2]")).click();
		String expected = "Trường tổng doanh thu kỳ này không được bỏ trống.";
		String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[4]/td[2]/p")).getText();
		if (expected.equals(actual)) {
			System.out.print("Test success");
		} else {
			System.out.print("Test failed");
		}
		driver.close();
}
	@Test
	public void testcase3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test8888");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Xu@n1998");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Đăng Nhập')]")).click();
		driver.findElement(By.xpath("//header/div[1]/div[2]/button[1]")).click();
		// click vào quyết toán theo thu nhập
		driver.findElement(By.xpath("//*[@id=\"simple-popover\"]/div[3]/ul/div[1]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement debt = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[3]/td[2]/p/span[1]"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[4]/td[2]/div/div/input")).sendKeys("120");		
		//driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[7]/td[2]/div/div/input")).sendKeys("11");
		System.out.print(debt.getAttribute("innerHTML"));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/button[2]")).click();
		String expected = "Trường số tiền đã nộp không được bỏ trống.";
		String actual = driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[2]/table/tbody/tr[7]/td[2]/p")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase : success");
		} else {
			System.out.print("Testcase : failed");
		}
		driver.close();
}
}
