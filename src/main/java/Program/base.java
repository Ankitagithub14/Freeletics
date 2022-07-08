package Program;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	//public WebDriver driver;

@SuppressWarnings("deprecation")
public WebDriver InitlializeDriver() throws IOException
{
	Properties prop= new Properties();
	FileInputStream fis = new FileInputStream("src\\main\\java\\Program\\data.properties");
	prop.load(fis);
    System.setProperty(prop.getProperty("chromeDriver"), "driver/chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
		return driver;	
 
}
}
