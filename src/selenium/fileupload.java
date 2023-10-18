package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://qavbox.github.io/demo/signup/");
driver.manage().window().maximize();
WebElement fileupload = driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
fileupload.sendKeys("C:\\Users\\user\\Downloads\\butterfly.jpg");

try
{
	Thread.sleep(5000);
	}
catch (InterruptedException e)
{
	e.printStackTrace();
}
}
	}
