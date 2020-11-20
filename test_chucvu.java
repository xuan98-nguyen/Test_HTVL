package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_chucvu {
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
		WebElement item = driver.findElement(By.xpath("//ul/div[2]/div/div/div[5]/div[2]"));
		item.click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("tổng thống");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();}
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
    		WebElement item = driver.findElement(By.xpath("//ul/div[2]/div/div/div[5]/div[2]"));
    		item.click();
    		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div[2]/div[1]/div[1]/button")).click();
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div/div/div/input")).sendKeys("tổng thống");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div[2]/div/div[2]/button")).click();
        }
}
