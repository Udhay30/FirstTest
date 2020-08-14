package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class Utility {
	static WebDriver driver = null;

	public static WebDriver initBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;

	}

	public static WebDriver customBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			// driver=new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			// System.setProperty("webdriver.gecko.driver",
			// "D:\\Downloads\\Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Downloads\\Internet Explorer\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();

		}
		return driver;
	}

	public static WebDriver loginVcentryApp(String url, String username,String password, String returnurl) {
		driver.get(url);
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		loginLink.click();

		WebElement userName = driver.findElement(By.id("id_username"));
		WebElement passWord = driver.findElement(By.id("id_password"));

		userName.sendKeys(username);

		passWord.sendKeys(password);
		passWord.submit();
		driver.get(returnurl);
		return driver;

	}

}
