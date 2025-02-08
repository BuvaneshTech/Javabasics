package B_Assignemnt_144;

import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Url_Get_Close_quit {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		
		// driver.quit();
		
		driver.navigate().to("https://www.facebook.com");
		driver.close();
		
		

	}

}
