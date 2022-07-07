package DemoPackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.junit.Test;
import org.testng.annotations.Test;

import Helper.commonMethod;
import Program.base;
//import dev.failsafe.internal.util.Assert;

public class FreeLetics extends base  {
	static Logger logger= Logger.getLogger(FreeLetics.class.getName());
	public WebDriver driver;
		
@BeforeTest
public void initialize() throws IOException {
	driver=InitlializeDriver();
    driver.manage().window().maximize();
}
@Test
  public void freeletics() throws InterruptedException, IOException  {
	//created the base class and call the method here
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.freeletics.com");
		//creating the object of the class to invoke the method
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
		commonMethod commonmethod= new commonMethod(driver);
		commonmethod.lookForCareersAndQAJob().click();
		commonmethod.validation();
		commonmethod.applyNow();
	}

@AfterTest
public void close() {
	driver.quit();
  }



}
		

		
		





