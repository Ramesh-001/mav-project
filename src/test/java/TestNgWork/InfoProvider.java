package TestNgWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InfoProvider {
	
	@Test (dataProvider ="datas")
	 public void chromedrivertest(String user, String pass) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("email")).sendKeys(user);
	  driver.findElement(By.id("pass")).sendKeys(pass);
	  driver.findElement(By.id("loginbutton")).click();
	  driver.close();


}
	
	@DataProvider(name ="datas")
	public Object[] [] data(){
		return new Object[][] {{"ramesh","rocky"},{"jai","warrior"}};
	}

}