package TestNgWork;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.util.RetryAnalyzerCount;

public class SampleTestNg {
	
	/*WebDriver chromdriver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		  chromdriver= new ChromeDriver();		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("done");
	}
	
	 @Test (invocationCount=2)
	 public void chromedrivertest() throws InterruptedException {
	  
	  chromdriver.get("https://www.facebook.com/");
	  Thread.sleep(5000);
	  
	 }*/
	 
	 @Test 
	 public void amazonPage() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		WebDriver chromdriver= new ChromeDriver();	
	  
	  chromdriver.get("https://www.amazon.in/");
	  String title = chromdriver.getTitle();
	  SoftAssert s = new SoftAssert();
	  s.assertTrue(false);
	  System.out.println(title);
	  Thread.sleep(3000);
	  chromdriver.close();
	 }
	 
	 @Test 
	 public void guruPage() throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\chromedriver.exe");
		  WebDriver chromdriver= new ChromeDriver();		
	  
	  chromdriver.get("http://demo.guru99.com/telecom/index.html");
	  Thread.sleep(3000);
	  chromdriver.close();
	 }
	  
	 
	
	/* @Test 
	  public void iedriver() throws InterruptedException { 
		  System.setProperty("webdriver.ie.driver","C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\IEDriverServer.exe"); 
		  WebDriver iedriver= new InternetExplorerDriver();
		  iedriver.get("https://www.facebook.com/");
		  Thread.sleep(5000);
		  iedriver.close();
	  }*/
	  
	  
	 
	@Test
	public void fireboxdriver() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ramesh\\eclipse-workspace\\BasicTestNg\\driver\\geckodriver.exe");
		WebDriver ffdriver= new FirefoxDriver();
		ffdriver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		ffdriver.close();
	
	}

	}


