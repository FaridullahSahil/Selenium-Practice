package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondWay {

	public static void main(String[] args) {
		String userDirectory= System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe";
		System.setProperty("webdriver.edge.driver",userDirectory);  
		WebDriver driver= new EdgeDriver();
		
	}

}
