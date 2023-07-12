package basicCommands;
public class BasicCommands extends MainClass{

public static void main(String[] args) {
	driver=setUpBrowser();
	String URL="https://www.google.com/";
	driver.get(URL);
	String title=driver.getTitle();
	System.out.println(title);
	String expectedtitle="Google";
	if(driver.getTitle().contains(expectedtitle))
	System.out.println("Test Passed");
	else
		System.out.println("Test Failed");
	String url=driver.getCurrentUrl();
	if(url.equals(URL))
		System.out.println("URL Matched");
	else
		System.out.println("URL Not Matched");
		driver.close();
		//driver.quit (); this closes a number of browsers at one time.
	}

}
