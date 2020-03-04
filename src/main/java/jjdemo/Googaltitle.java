package jjdemo;

	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	
	public class Googaltitle {
		
			@Test
			public void tt(){
		 
	  System.setProperty("webdriver.gecko.driver","F:\\Selenium setup\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
					
//			System.setProperty("webdriver.ie.driver","F:\\Selenium Software\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
//			WebDriver driver=new InternetExplorerDriver();
//	    
		
		 driver.get("https://www.google.com/");
//		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		  
		 String title= driver.getTitle();
		 
		 System.out.println("title is + title");
		 
		 if(title.equalsIgnoreCase("Google")){
			 System.out.println("title is matched");
		 }
		 else {
			 System.out.println("title is mitchmatched");
		 }
			  
		 driver.close();
		}
	}
		 
		
		
	

