package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ByButton {
	public static void clickId(String id) {
		WebDriver drive = StartChrome.driver; 
		drive.findElement(By.id(id)).click();
	}
}
