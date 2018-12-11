package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.lang.Math;
public class inputData {
	
	
	public static void inputText(String id,String text) {
		WebDriver drive = StartChrome.driver; 
		drive.findElement(By.id(id)).sendKeys(text);
	}
	public static String generateNumber()
	{
	String s1 = "0";
	double d = Math.random();
	d=d*1000000000.0;
	int i = (int) d;
	String s2 = String.valueOf(i);
	String s3=s1+s2;
	
	return s3;
	 
	}

}
