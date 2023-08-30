package UtilsPackage1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;


public class HelperClass{
	
	private static HelperClass HelpClass;
	private static WebDriver driver;
    public final static int TIMEOUT = 30;
       
     private HelperClass() {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Java\\Chrome\\chromedriver.exe");
    	ChromeOptions options = new ChromeOptions();
    	options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
        driver.manage().window().maximize();
     }   
     
     public static void screenshot() {
    	 File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

 		try {
			FileUtils.copyFile(File,new File("C:\\Users\\Administrator\\Desktop\\Schedule Order.jpeg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
     }
     
     public static void zoomOut(){
		try {
			Robot robot = new Robot();
			Thread.sleep(1000);
	 		for (int k = 0; k < 4; k++) {
	 			robot.keyPress(KeyEvent.VK_CONTROL);
	 			robot.keyPress(KeyEvent.VK_SUBTRACT);
	 			robot.keyRelease(KeyEvent.VK_SUBTRACT);
	 			robot.keyRelease(KeyEvent.VK_CONTROL);
	 		}
		} catch (AWTException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
 	}
     
     public static void openPage(String url) {
         driver.get(url);
     }
     
     public static WebDriver getDriver() {
         return driver;              
     }
     
     public static void setUpDriver() {
         
         if (HelpClass==null) {
                
        	 HelpClass = new HelperClass();
         }
     }
     
     public static void implicitWait() {
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
 	}
        
     @AfterMethod
 	public static void tearDown() {
             
         if(driver!=null) {
              driver.close();
              driver.quit();
         }
             
         HelpClass = null;
    }

	public static void sleep(int num) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(num);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
