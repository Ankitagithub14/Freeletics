package DemoPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.Test;
import org.testng.annotations.Test;

public class FreeLetics {
	
@Test
    public void freeletics() throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITA\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://www.freeletics.com");
		//driver.wait();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='AisLsJaE_AWn C2vDPvrShYYx xK8HVPyWXV90 cdc4_xoyu5lt']")).click();
		js.executeScript("window.scrollBy(0,8000)");
		boolean present;
		try {
		
			driver.findElement(By.xpath("//a[@data-analytics-ga-subcategory=\"footer-links\"][@data-analytics-ga-attribute='careers']"));
			present = true;
		} catch (NoSuchElementException e) {
		   present = false;
		}
		driver.findElement(By.xpath("//a[@data-analytics-ga-subcategory=\"footer-links\"][@data-analytics-ga-attribute='careers']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='AisLsJaE_AWn xK8HVPyWXV90 eG_BJQQLdVcX ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='engineering']/div/ul/li[2]/a")).click();
	    Thread.sleep(2000);
		System.out.println(driver.getTitle());
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@itemprop=\"description\"]//div[3]")).getText());
		js.executeScript("window.scrollBy(0,500)");
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@itemprop='responsibilities']//*[@class='TutZ5JVTzsxW vzImM84lyY07']")).getText());
		Thread.sleep(1000);
		List<WebElement> resp = driver.findElements(By.xpath("(//*[@itemprop=\"responsibilities\"]//ul)/li"));
		System.out.println(resp.size());
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,300)");
		//Thread.sleep(3000);
		System.out.println(driver.findElement(By.xpath("//*[@itemprop='experienceRequirements']//*[@class='TutZ5JVTzsxW vzImM84lyY07']")).getText());
		Thread.sleep(1000);
		List<WebElement> profile = driver.findElements(By.xpath("(//*[@itemprop='experienceRequirements']//ul)/li"));
		System.out.println(profile.size());
		Thread.sleep(500);
		js.executeScript("window.scrollBy(0,600)");
		driver.findElement(By.xpath("//*[@class='AisLsJaE_AWn xK8HVPyWXV90 cdc4_xoyu5lt ']")).click();
		Thread.sleep(2000);
		List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
		System.out.println(browserTabs.size());
		//switch to new tab
		driver.switchTo().window(browserTabs .get(1));
		Thread.sleep(1000);
		System.out.print(driver.findElement(By.xpath("((//*[@class='section-wrapper page-full-width'])//h4)[1]")).getText());
		driver.close();
		driver.switchTo().window(browserTabs.get(0));
		driver.close();

		/*
		if(driver.findElements(By.xpath("//*[@itemprop=\"description\"]//div[3]")).contains("QA Engineer")
		    //Pass
		    System.out.println("Paragraph  contains \"some expected text\" ");
		else
		    //Fail
		    System.out.println("Para doesn't contains \"some expected text\" ");*/
		//System.out.println(driver.findElements(By.xpath("//*[@itemprop='description']/div[3]")));
		//driver.close();
		

	}
}
