package eCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Meesho {
  @Test
  public void meeshoTest() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.meesho.com");
		Thread.sleep(4000);
		driver.close();
  }
}
