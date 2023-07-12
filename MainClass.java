//package basicCommands;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//public class MainClass {

	//public static WebDriver driver;
	//public static void setUpBrowser() {
		
		//String userDirectory=System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";
		//System.setProperty("webdriver.edge.driver", userDirectory);
		//driver=new EdgeDriver();
	//}

//}
// we need to create methods for Chrome and Edge brower so we can call it anywher we needs it. 
// we need following program for that:

package basicCommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MainClass {

	public static WebDriver driver;
	public static WebDriver setUpBrowser() {
		
		String browserName="chrome";
		if(browserName.contains("chrome")) {
			String userDirectory=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", userDirectory);
			driver=new ChromeDriver();
	}
	else if(browserName.contains("edge")) {
		String userDirectory=System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver", userDirectory);
		driver=new EdgeDriver();
	}
		else {
			System.out.println("Wrong Browser selection");}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		return driver;
		}

}