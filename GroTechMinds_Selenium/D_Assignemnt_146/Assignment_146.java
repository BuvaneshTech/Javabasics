package D_Assignemnt_146;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Launch Google----> search India----->enter button        
Launch Amazon search shoes ---->Press enter button*/

public class Assignment_146 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.id("APjFqb"));
		a.sendKeys("India"+Keys.ENTER);
		Thread.sleep(5000);
		
		driver.navigate().to("https://www.amazon.com");
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		WebElement ama = driver.findElement(By.id("twotabsearchtextbox"));
		ama.sendKeys("Shoes"+Keys.ENTER);
		

	}

}
