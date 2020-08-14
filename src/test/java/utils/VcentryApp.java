package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VcentryApp {

	public static void loginApp(WebDriver wd){
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement loginLink=wd.findElement(By.linkText("Login"));
		loginLink.click();
		
		WebElement username=wd.findElement(By.id("id_username"));
		WebElement password=wd.findElement(By.id("id_password"));
	
		
		username.sendKeys("Udhay");
		password.sendKeys("u&d@904830");
		password.submit();
	}
}
