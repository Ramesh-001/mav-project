package AmazonWeb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMobile {
	
    public static void main(String[] args) throws AWTException, InterruptedException {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles ");
		  
		  Thread.sleep(5000);
		  
		  Robot r = new Robot();
		  
		  for (int i = 1; i < 6; i++) {
			  r.keyPress(KeyEvent.VK_DOWN);
			  r.keyRelease(KeyEvent.VK_DOWN);
			  
		}
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  WebElement down = driver.findElement(By.xpath("//span[text()='Need help?']"));
		  JavascriptExecutor jk=(JavascriptExecutor)driver;
		  jk.executeScript("arguments[0].scrollIntoView(true)", down);
		  
		  for (int i = 1; i < 6; i++) {
		  r.keyPress(KeyEvent.VK_UP);
		  r.keyRelease(KeyEvent.VK_UP);
		  }
		  Thread.sleep(10000);
		  //driver.findElement(By.xpath("(//a[contains(text(),'2')])[1]")).click();
		  
		  driver.findElement(By.xpath("(//li[@class=\"a-normal\"])[1]")).click();

		  
		  Thread.sleep(5000);
		  List<WebElement> mob = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			 
			 
		  for (int i = 0; i < 5; i++) 			
		 {
			  //System.out.println("mobile name :" + mobname.getText());
			  mob.get(i).click();
		  }
		  String pwin = driver.getWindowHandle();
		  System.out.println(pwin);
		  
		  Set<String> allwin = driver.getWindowHandles();
		  ArrayList<String> list= new ArrayList<String>();
		  list.addAll(allwin);
		  System.out.println("list" + list);
		  
		 for (int i = 1; i <=5; i++) {
			  
			  driver.switchTo().window(list.get(i));
			  //WebElement star = driver.findElement(By.id("(//span[contains(@class,\"a-icon-alt\")])[1]"));
			  WebElement mobile = driver.findElement(By.id("productTitle"));
			  System.out.println("mobile name" + mobile.getText());
			  //System.out.println("Rating" + star.getText());
			 
		  }
		  driver.switchTo().window(list.get(0));
		  System.out.println("list" + list);
		  System.out.println(pwin);
  
		 
		  /*
		  Thread.sleep(5000);
		 List<WebElement> price = driver.findElements(By.xpath("//span[@class=\"a-price-whole\"]"));
		for (WebElement mobprice : price) {
		System.out.println("mobile price:" +mobprice.getText());
		 }
		  //driver.quit();
		  int count = 3;
		  Set<String> child = driver.getWindowHandles();
		  for (String hand:child) {
		  if(count == child.size()) {
			  driver.switchTo().window(hand);
			  
		  }
		  count++;*/

}
}