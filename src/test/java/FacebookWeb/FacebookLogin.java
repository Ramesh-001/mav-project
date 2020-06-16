package FacebookWeb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin {
	
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		 
		System.out.println("Facebook login page is opened");
		String currurl = driver.getCurrentUrl();
		driver.quit();
				
	}

}
