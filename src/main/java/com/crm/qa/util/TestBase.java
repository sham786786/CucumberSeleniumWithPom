package com.crm.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	public static ExplWaits waits;

	//static String crmUsername;
	// create constructor
	public TestBase() throws IOException {

		// read properties
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"C:/Selenium/eclipse-workspace/FreeCRMCucumber"
					+ "/src/main/java/com/crm/qa/config/config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}
	}
	
	public static void Initialization() {
		String browsername=prop.getProperty("browser");
		if (browsername.equals ("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
			System.setProperty("webdriver.chrome.silentOutput", "true");
			driver = new ChromeDriver();
			
		}
		else if(browsername.equals ("FF")) {
			System.setProperty("webdriver.gecko.driver", "C:/Selenium/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(browsername.equals ("IO")) {
			System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
			driver = new FirefoxDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestWaits.PAGE_LOADS_TIMEOUTS, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestWaits.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
		
	
	}
	
	public void wait(int mills) {

        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
