package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*
		//using absolute xpath
		//passing value
		WebElement searchbox = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbox.sendKeys("watches for women");
		//click on search button
		WebElement searchbt = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbt.click();
		// for clearing text from searchbox
		WebElement searchclear = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchclear.clear();
		// again inpuut
		WebElement searchbox2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input"));
		searchbox2.sendKeys("watches for men");
		// again search
		WebElement searchbutton2 = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[3]/div/span/input"));
		searchbutton2.click();
		
		
		//using relative xpath
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		searchbutton2.click();*/
		
		/*using xpath OR
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'or @name='field-keywords']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("//input[@id='nav-search-submit-button'or @type='submit']"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button'or @type='submit']"));
		searchbutton2.click();*/
		
		/*using xpath AND
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'and @name='field-keywords']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("//input[@id='nav-search-submit-button'and @type='submit']"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button'and @type='submit']"));
		searchbutton2.click();*/
		
		//Using chain xpath
		
		/*WebElement searchbox = driver.findElement(By.xpath("//form[@id='nav-search-bar-form'] // input[@name='field-keywords']"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("//form[@id='nav-search-bar-form'] // input[@type='submit']"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//form[@id='nav-search-bar-form'] // input[@name='field-keywords']"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//form[@id='nav-search-bar-form'] // input[@name='field-keywords']"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//form[@id='nav-search-bar-form'] // input[@type='submit']"));
		searchbutton2.click();*/
		
		//using contains
		/*WebElement searchbox = driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("// input[contains(@type,'submit')]"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//input[contains(@name,'field-keywords')]"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		searchbutton2.click();*/
		
		//using start-with
		/*WebElement searchbox = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		searchbox.sendKeys("watches for women");
		WebElement searchbt = driver.findElement(By.xpath("// input[starts-with(@type,'submit')]"));
		searchbt.click();
		WebElement searchclear = driver.findElement(By.xpath("//input[starts-with(@name,'field-keywords')]"));
		searchclear.clear();
		WebElement searchbox2 = driver.findElement(By.xpath("//input[starts-with(@id,'twotabsearchtextbox')]"));
		searchbox2.sendKeys("watches for men");
		WebElement searchbutton2 = driver.findElement(By.xpath("//input[starts-with(@type,'submit')]"));
		searchbutton2.click();*/
		
		//using text
		WebElement search = driver.findElement(By.xpath("//a[text()='Amazon miniTV']"));
		search.click();
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
