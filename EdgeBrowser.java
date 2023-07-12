package basicCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sahil\\Downloads\\edgedriver\\msedgedriver.exe");
		WebDriver driver= new EdgeDriver();

	}

}
  