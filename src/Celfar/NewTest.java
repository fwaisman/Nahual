package Celfar;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	private WebDriver driver;
	String baseUrl;
	
  @Test
  public void f() {
	  
	  driver.get(baseUrl+"/?v=1");
	  
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.setProperty("webdriver.chrome.driver", "c:\\drivers\\chromedriver.exe");
	  driver = new ChromeDriver();
	  baseUrl= "http://nahual.github.io/qc-celfar";
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
