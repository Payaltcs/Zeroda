package Upstox_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class with_DDF {
	public static void main(String[]args) throws Throwable {
		
		//navigate to sheet in excel
		FileInputStream fis = new FileInputStream("C:\\\\browser\\\\chromedriver.exe");
		
		WorkbookFactory.create(fis).getSheet("Sheet1");
		
		//set the properties
		System.setProperty("webdriver.chrome.driver", "C:\\\\browser\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//open the application
		driver.get("https://login-v2.upstox.com/");
		
		
	}

	


}
