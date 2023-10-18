package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		//driver.manage().window().maximize();
		
		//Actions ab = new Actions(driver);
		//WebElement right = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//ab.contextClick(right).perform();
		
		/*Demoqa
		 * Double*/
		
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		
		Actions ac1 = new Actions(driver);
		Actions ac2 = new Actions(driver);
		Actions ac3 = new Actions(driver);
		
		
		WebElement db = driver.findElement(By.id("doubleClickBtn"));
		ac1.doubleClick(db).perform();
		
		WebElement right =driver.findElement(By.id("rightClickBtn"));
		ac2.contextClick(right).perform();
		
		WebElement cl = driver.findElement(By.cssSelector("#WVyLP"));
	    ac3.click(cl).perform();

	}

}
