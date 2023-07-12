//package basicCommands;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;

//public class FacebookLogin {

	//public static void main(String[] args) {
		
//MainClass.setUpBrowser();
	//}

//}
//With above command we can open edge browser via calling the metheod but we want to call facebook, edge or chrome whatever we want. 
//we need to this with the if command as follows;

package basicCommands;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//Test commit

public class FacebookLogin extends MainClass{

	public static void main(String[] args) {
driver=setUpBrowser();
driver.get("https://www.google.com");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sahil");

	}

}