package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StartChrome {
	public static WebDriver driver ;
	public static void startBrowser(String link) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ilabadmin\\Pictures\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get(link);
	    
	}
	public static void closeBrowser() {
		
	    driver.close();
	}
	public Object findElement(By linkText) {
		// TODO Auto-generated method stub
		return linkText;
	}
}
