package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class relativepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		WebElement fullname = driver.findElement(By.xpath("//input[@id='username']"));
		fullname.sendKeys("Filda Rodrigues");
		
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("fildarose@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@id='tel']"));
		phone.sendKeys("8078312084");
		
		WebElement fileupload = driver.findElement(By.xpath("//input[@name='datafile']"));
		fileupload.sendKeys("C:\\Users\\user\\Downloads\\butterfly.jpg");
		
		Select gender = new Select(driver.findElement(By.xpath("//select[@name='sgender']")));
		gender.selectByIndex(2);
		
		WebElement exp = driver.findElement(By.xpath("//input[@value='six']"));
		exp.click();
		
		WebElement skills = driver.findElement(By.xpath("//input[@value='automationtesting']"));
		skills.click();
		
		WebElement selenium = driver.findElement(By.xpath("//option [@value='selenium']"));
		selenium.click();
		
		WebElement submit = driver.findElement(By.xpath("//input [@id='submit']"));
		submit.click();
		
		try
		{
			Thread.sleep(4000);
			}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.close();
	}

}
