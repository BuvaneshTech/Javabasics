package C_Assignemnt_145;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Launch Amazon search shoes        
Launch Amazon search shoes ---->Press enter button        
Launch Amazon search shoes ---->Click on search button. */

public class Assignemnt_145 {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Amazon search shoes ---->Press enter button
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.navigate().to("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
        Thread.sleep(5000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Shoes"+Keys.ENTER);
		
		
		//Launch Amazon search shoes ---->Click on search button
		
		
		driver.navigate().to("https://www.amazon.com");
		
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("Shoes");
		WebElement b = driver.findElement(By.id("nav-search-submit-button"));
		b.click();
		
		
		


		
		
		

	}

}
