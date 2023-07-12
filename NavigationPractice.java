 package basicCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NavigationPractice extends MainClass {

	public static void main(String[] args) {

	driver=setUpBrowser();
	
	driver.navigate().to("https://www.google.com/");
	String about=driver.findElement(By.xpath("//a[@class='MV3Tnb']")).getAttribute("href");
 	System.out.println(about);
 	
 	List<WebElement>allLinksonpage=driver.findElements(By.tagName("a"));
 	System.out.println(allLinksonpage.size());
 	for(int i=0; i<allLinksonpage.size(); i++) {
 		String links=allLinksonpage.get(i).getText();
 		System.out.println(links);
 		if(links.equalsIgnoreCase("Store")) {
 			allLinksonpage.get(i).click();
 			break;
 		}
 }
	
	//about.click();
	System.out.println("Before Nagication title "+driver.getTitle());
	
driver.navigate().to("https://www.amazon.com/");
System.out.println("Before Nagication title "+driver.getTitle());
	
	driver.navigate().back();
    System.out.println("After back title title "+driver.getTitle());
	
	driver.navigate().forward();
	System.out.println("After back title "+driver.getTitle());
		
	System.out.println(driver.getTitle());
	
	List<WebElement> input = driver.findElements(By.tagName("input")); 	 
	System.out.println(input.size());

	}}
	
