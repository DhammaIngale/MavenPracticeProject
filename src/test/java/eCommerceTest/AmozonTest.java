package eCommerceTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmozonTest {
  @Test
  public void amozonTest() throws InterruptedException {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.amazon.com/");
	  Thread.sleep(3000);
	  driver.close();
  }
}
