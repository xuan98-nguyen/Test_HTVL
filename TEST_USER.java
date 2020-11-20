package DEMO_TEST;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TEST_USER {
	WebDriver driver;
	@Test
	public void testcase1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test123");
		driver.findElement(By.id("user_full_name")).sendKeys("tester");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0978859801");
		driver.findElement(By.id("create_new_user")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/user/create";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Testcase 1: success");
		} else {
			System.out.print("Testcase 1:  failed");
		}
		driver.close();
	}
	//bo trong username
	@Test
	public void testcase2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản không được bỏ trống.";
		String actual = driver.findElement(By.id("user_name-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 2: success");
		} else {
			System.out.print("Testcase 2:  failed");
		}

		driver.close();
	}
	//nhap ussername = cac space
	@Test
	public void testcase3() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("        ");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản không được bỏ trống.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		if (expected.equals(actual)) {
			System.out.print("Testcase 3: success\n");
		} else {
			System.out.print("Testcase 3: failed\n");
		}

		driver.close();
	}
	//nhap ten dang nhap = 31 ki tu
	@Test
	public void testcase4() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản không được lớn hơn 30 ký tự.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 4 : success\n");
		} else {
			System.out.print("Testcase 4 : failed\n");
		}
		driver.close();
	}
	//nhap ten dang nhap co trong CSDl
	@Test
	public void testcase5() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test123");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản đã có trong cơ sở dữ liệu.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 5 : success\n");
		} else {
			System.out.print("Testcase 5 : failed\n");
		}
		driver.close();
	}
//nhập tên đăng nhập = 5 kí tự 
	@Test
	public void testcase6() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản phải có tối thiểu 5 ký tự.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 6:  success\n");
		} else {
			System.out.print("Testcase 6: failed\n");
		}
		driver.close();
	}
//nhap ten day du hopw le
	@Test
	public void testcase7() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test888");
		driver.findElement(By.id("user_full_name")).sendKeys("test123");
		driver.findElement(By.id("user_email")).sendKeys("quyet010191@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/user/create";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Test success");
		} else {
			System.out.print("Test failed");
		}
		driver.close();
	}

	// bỏ trống tên đầy đủ
	@Test
	public void testcase8() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tên đầy đủ không được bỏ trống.";
		String actual = driver.findElement(By.id("user_full_name-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 8: success\n");
		} else {
			System.out.print("Testcase 8: failed\n");
		}
		driver.close();
	}

	// nhập tên đầy đủ = space
	@Test
	public void testcase9() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("           ");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tên đầy đủ không được bỏ trống.";
		String actual = driver.findElement(By.id("user_full_name-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 9: success\n");
		} else {
			System.out.print("Testcase 9:  failed\n");
		}
		driver.close();
	}

	// nhập tên đày đủ = 257 kí tự
	@Test
	public void testcase10() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys(
				"zf5suzhqtCJDLGChXmaKdC3Es5o4un1k4PEVnJOceyd8rwVJJUM7e9ufsBCyZ6yMa8KekfS0vMazYduXhxW6SfRbRJCwl1hb4IDenqv1uohXkzOpjJxBSvpYYjYYkHdiAY8H8YSrrXyhI4NVK9Fj1yGezslvQfZBpR1ztrQPkGfBGMNk2jctV7F4QIG0TY6jztRsqJ6PnoRTYLpDMD7VGUWCMP2WoNaqBrThe2UOYQANOSHfIaUCHslYTOqMnW8V\r\n"
						+ "");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tên đầy đủ không được lớn hơn 255 ký tự.";
		String actual = driver.findElement(By.id("user_full_name-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 10: success\n");
		} else {
			System.out.print("Testcase 10: failed\n");
		}
		driver.close();
	}

	// bỏ trống email
	@Test
	public void testcase11() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/user/";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Testcase 11: success\n");
		} else {
			System.out.print("Testcase 11: failed\n");
		}
		driver.close();
	}
	//nhập email = các space 
	@Test
	public void testcase12() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("              ");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expectedURL = "http://dev.solashi.com:2896/quanly/user/";
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		if (expectedURL.equals(actualURL)) {
			System.out.print("Testcase 12: success\n");
		} else {
			System.out.print("Testcase 12: failed\n");
		}
		driver.close();
	}
//nhập email = 257 kí tự 
	@Test
	public void testcase13() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("zf5suzhqtCJDLGChXmaKdC3Es5o4un1k4PEVnJOceyd8rwVJJUM7e9ufsBCyZ6yMa8KekfS0vMazYduXhxW6SfRbRJCwl1hb4IDenqv1uohXkzOpjJxBSvpYYjYYkHdiAY8H8YSrrXyhI4NVK9Fj1yGezslvQfZBpR1ztrQPkGfBGMNk2jctV7F4QIG0TY6jztRsqJ6PnoRTYLpDMD7VGUWCMP2WoNaqBrThe2UOYQANdfdgggggOS@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường địa chỉ email không được lớn hơn 255 ký tự.";
		String actual = driver.findElement(By.id("user_email-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 13: success\n");
		} else {
			System.out.print("Testcase 13: failed\n");
		}
		driver.close();
	}
	//nhập email đã có trong CSDL 
	@Test
	public void testcase14() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường địa chỉ email đã có trong cơ sở dữ liệu.";
		String actual = driver.findElement(By.id("user_email-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 14: success\n");
		} else {
			System.out.print("Testcase 14: failed\n");
		}
		driver.close();
	}
	//nhập email k đúng định dạng 
	@Test
	public void testcase15() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("abcbcbgmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường địa chỉ email phải là một địa chỉ email hợp lệ.";
		String actual = driver.findElement(By.id("user_email-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 15: success\n");
		} else {
			System.out.print("Testcase 15: failed\n");
		}
		driver.close();
	}
	//bỏ trống mật khẩu 
	@Test
	public void testcase16() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường mật khẩu không được bỏ trống.";
		String actual = driver.findElement(By.id("user_pasword-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 16: success\n");
		} else {
			System.out.print("Testcase 16: failed\n");
		}
		driver.close();
	}
	//nhập mật khẩu = 5 kí tự 
	@Test
	public void testcase17() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường mật khẩu phải có tối thiểu 6 ký tự.";
		String actual = driver.findElement(By.id("user_pasword-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 17: success\n");
		} else {
			System.out.print("Testcase 17: failed\n");
		}
		driver.close();
	}
	//nhập mật khẩu > 255 kí tự
	@Test
	public void testcase18() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("zf5suzhqtCJDLGChXmaKdC3Es5o4un1k4PEVnJOceyd8rwVJJUM7e9ufsBCyZ6yMa8KekfS0vMazYduXhxW6SfRbRJCwl1hb4IDenqv1uohXkzOpjJxBSvpYYjYYkHdiAY8H8YSrrXyhI4NVK9Fj1yGezslvQfZBpR1ztrQPkGfBGMNk2jctV7F4QIG0TY6jztRsqJ6PnoRTYLpDMD7VGUWCMP2WoNaqBrThe2UOYQANdfdgggggOSdsgdsgsnnn");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường mật khẩu có định dạng không hợp lệ.Trường mật khẩu không được lớn hơn 255 ký tự.";
		String actual = driver.findElement(By.id("user_pasword-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 18: success\n");
		} else {
			System.out.print("Testcase 18: failed\n");
		}
		driver.close();
	}
	//nhập mật khẩu = kí tự 
	@Test
	public void testcase19() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("123456");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường mật khẩu có định dạng không hợp lệ.";
		String actual = driver.findElement(By.id("user_pasword-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 19: success\n");
		} else {
			System.out.print("Testcase 19: failed\n");
		}
		driver.close();
	}
	//bỏ trống số điện thoại
	@Test
	public void testcase20() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường số điện thoại không được bỏ trống.";
		String actual = driver.findElement(By.id("user_phone-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 20: success\n");
		} else {
			System.out.print("Testcase 20: failed\n");
		}
		driver.close();
	}
	//nhập số điện thoại đã có trong CSDL 
	@Test
	public void testcase21() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0978859801");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản phải có tối thiểu 5 ký tự.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Test success\n");
		} else {
			System.out.print("Test failed\n");
		}
		driver.close();
	}
	//nhập số điện thoiaj = 11 số 
	@Test
	public void testcase22() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("tesst98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("03498432711");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường số điện thoại có định dạng không hợp lệ.";
		String actual = driver.findElement(By.id("user_phone-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 22: success\n");
		} else {
			System.out.print("Testcase 22: failed\n");
		}
		driver.close();
	}
	//nhập số điện thoại = text
	@Test
	public void testcase23() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("số điện thoại");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường số điện thoại có định dạng không hợp lệ.";
		String actual = driver.findElement(By.id("user_phone-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 23: success\n");
		} else {
			System.out.print("Testcase 23: failed\n");
		}
		driver.close();
	}
	//k chọn phòng ban
	@Test
	public void testcase24() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("xuannt");
		driver.findElement(By.id("user_full_name")).sendKeys("test98");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@solashi.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n1998");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		//driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0349843271");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản phải có tối thiểu 5 ký tự.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Test success\n");
		} else {
			System.out.print("Test failed\n");
		}
		driver.close();
	}
	//k chọn chức vụ 
	@Test
	public void testcase25() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test123");
		driver.findElement(By.id("user_full_name")).sendKeys("xuân nguyễn");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n199");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		//driver.findElement(By.id("user_job_title")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		driver.findElement(By.id("user_role")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0978898989");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường tài khoản phải có tối thiểu 5 ký tự.";
		String actual = driver.findElement(By.className("MuiFormHelperText-root")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Test success\n");
		} else {
			System.out.print("Test failed\n");
		}
		driver.close();
	}
	//k chọn nhóm người dùng 
	@Test
	public void testcase26() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Downloads\\Hook\\dataset\\IMG_0534\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://dev.solashi.com:2896/");
		driver.findElement(By.linkText("Đăng nhập")).click();
		driver.findElement(By.id("username")).sendKeys("hieund");
		driver.findElement(By.id("password")).sendKeys("111111");
		driver.findElement(By.className("jss83")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.className("jss115")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.className("jss117")).click();
		driver.findElement(By.className("MuiButton-containedPrimary")).click();
		driver.findElement(By.id("user_name")).sendKeys("test123");
		driver.findElement(By.id("user_full_name")).sendKeys("xuân nguyễn");
		driver.findElement(By.id("user_email")).sendKeys("xuannt@gmail.com");
		driver.findElement(By.id("user_pasword")).sendKeys("Xu@n199");
		driver.findElement(By.id("user_department")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_department-option-0']/div")).click();
		driver.findElement(By.id("user_job_title")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='user_job_title-option-0']/div")).click();
		//driver.findElement(By.id("user_role")).click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//li[@id='user_role-option-0']/div")).click();
		driver.findElement(By.id("user_phone")).sendKeys("0978898989");
		driver.findElement(By.id("create_new_user")).click();
		String expected = "Trường Nhóm quyền không được bỏ trống.";
		String actual = driver.findElement(By.id("user_role-helper-text")).getText();
		System.out.println(actual);
		if (expected.equals(actual)) {
			System.out.print("Testcase 26: success\n");
		} else {
			System.out.print("Testcase 26: failed\n");
		}
		driver.close();
	}
	
	
}


