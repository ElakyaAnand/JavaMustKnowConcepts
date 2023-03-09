package configPropertiesExample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleConfigproperties {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver ob = null;
		
		FileInputStream filepath=new FileInputStream("config.properties");
		Properties properties=new Properties();
		properties.load(filepath);
		
		
		String browser= properties.getProperty("browser");
		String DriverLocation= properties.getProperty("driverlocation");
		
		
		if(browser.equalsIgnoreCase("CHrome"))
		{
			System.setProperty("webdriver.chrome.driver", DriverLocation);
			 ob=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", DriverLocation);
			 ob=new FirefoxDriver();
		}
		
		
		ob.get("https://www.google.com");

	}

}
