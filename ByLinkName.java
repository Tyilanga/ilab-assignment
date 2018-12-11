package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ByLinkName {
	

	public static void clickLink(String link) {
		WebDriver drive = StartChrome.driver; 	
		drive.findElement(By.linkText(link)).click();
	}	
}
