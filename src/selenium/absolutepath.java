package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class absolutepath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qavbox.github.io/demo/signup/");
		driver.manage().window().maximize();
		
		WebElement fullname = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[2]/input"));
		fullname.sendKeys("Filda Rodrigues");
		
		WebElement email =driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[3]/input"));
		email.sendKeys("fildarose@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[4]/input"));
		phone.sendKeys("8078312084");
		
		WebElement fileupload = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[6]/input"));
		fileupload.sendKeys("C:\\Users\\user\\Downloads\\butterfly.jpg");
		
		Select gender = new Select(driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[7]/select")));
		gender.selectByIndex(2);
		
		WebElement exp = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[8]/input[6]"));
		exp.click();
		
		WebElement skills = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[9]/input[2]"));
		skills.click();
		
		WebElement selenium = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/select/option[1]"));
		selenium.click();
		
		WebElement submit = driver.findElement(By.xpath("/html/body/form/fieldset/div/div/div[10]/input"));
		submit.click();
		
		
		try
		{
			Thread.sleep(5000);
			}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		driver.close();
	}

}
