package AmazonWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Strings;

public class FacebookLogin {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Facebook login page is opened");
		String currurl = driver.getCurrentUrl();
		System.out.println("current url is   "+ currurl);
		driver.quit();
				
	}

}
