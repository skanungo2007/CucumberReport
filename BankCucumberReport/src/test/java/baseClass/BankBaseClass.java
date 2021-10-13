package baseClass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.BankReadProperty;

public class BankBaseClass {
	
	
	protected static WebDriver driver;
	
	
	public static void setupBrowser() throws IOException {
		
		try {
			
			if(BankReadProperty.readProperty("browser").equalsIgnoreCase("chrome")) {
				
				String driverPath = System.getProperty("user.dir") + "\\driver\\chromedriver.exe";
				
				System.setProperty("webdriver.chrome.driver", driverPath);
				
				driver = new ChromeDriver();
				
				
			} else if(BankReadProperty.readProperty("browser").equalsIgnoreCase("edge")) {
				
				
				String driverPath = System.getProperty("user.dir") + "\\driver\\msedgedriver.exe";
				
				System.setProperty("webdriver.edge.driver", driverPath);
				
				driver = new EdgeDriver();
		
				
			} else {
				
				String driverPath = System.getProperty("user.dir") + "\\driver\\geckodriver.exe";
				
				System.setProperty("webdriver.gecko.driver", driverPath);
				
				driver = new FirefoxDriver();
				
			}
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get(BankReadProperty.readProperty("url"));
			
			
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.quit();
			
		}
		
		
		
	}

	
	public static void closeBrowser() {
		
		try {
			
			Thread.sleep(1000);
			
			driver.quit();
			
		} catch(Exception e) {
			
			e.printStackTrace();
			
			driver.quit();
			
			
		}
		
		
		
	}
	
	
	
}
