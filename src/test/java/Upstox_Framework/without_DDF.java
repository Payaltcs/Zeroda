package Upstox_Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class without_DDF {
	public static void main(String[] args) {
		 
		//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//delete all coockies
		driver.manage().deleteAllCookies();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//open the apllication
		driver.get("https://login-v2.upstox.com/");
		
		
	}

}
