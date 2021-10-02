package com.gtn.qa.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.gtn.qa.Utilities.Util;
import com.gtn.qa.Utilities.WebEventListener;

public class TestBase 
{
	public static WebDriver driver;
	public  static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public static void initialize() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("C:\\Users\\ramasegowda\\workspace2Parallel\\GTN_TMO_Automation\\src\\main\\java\\com\\gtn\\qa\\configurationProperties\\config.properties");
		prop.load(ip);
		String browserName=prop.getProperty("browser");
		
		if(browserName.equals("chrome"))
		{
			System.setProperty(prop.getProperty("chromeDriverKey"),prop.getProperty("chromeDriverValue"));
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("firefox"))
		{
			System.setProperty(prop.getProperty("firefoxDriverKey"),prop.getProperty("firefoxDriverValue"));
			FirefoxOptions options = new FirefoxOptions();
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("network.proxy.type", 1);//1=Manual Proxy
			//profile.setPreference("network.proxy.http", <proxy_url>);
			//profile.setPreference("network.proxy.http_port", 7777);
			//profile.setPreference("network.proxy.ssl", <proxy_url>);
			//profile.setPreference("network.proxy.ssl_port", 8888);
			//profile.setPreference("network.proxy.ftp", "localhost");
			profile.setPreference("network.proxy.socks_port", Util.socks_port);
			profile.setPreference("network.proxy.socks", Util.socks_url);
			options.setProfile(profile);
			options.setAcceptInsecureCerts(true);
			options.setCapability("disable-restore-session-state", true);
			options.setCapability("marionette", true);
			driver = new FirefoxDriver(options);
			System.out.println("Browser Launched and Proxy set "+Util.socks_port);
		}

		//EventFiringWebDriver org.openqa.selenium.support.events.EventFiringWebDriver object with driver input
		e_driver = new EventFiringWebDriver(driver);
		//WebEventListener(user defined class) implements WebDriverEventListener(org.openqa.selenium.support.events.WebDriverEventListener)
		eventListener = new WebEventListener();
		//registering EventFiringWebDriver object(e_driver) with WebEventListener object (eventListener)
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Util.page_Load_Timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Util.implicitly_Wait, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	public static void clearAll()
	{
		driver.quit();
	}
}
