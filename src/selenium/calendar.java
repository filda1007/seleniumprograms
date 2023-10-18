package selenium;

import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	    
	  //current date and time
	  //Calendar calendar_date_time=Calendar.getInstance();
	  //Date datetime = calendar_date_time.getTime();
	  //System.out.println(datetime);
	  //driver.close();

	    //future date and time
	    //Calendar calendar_date_time=Calendar.getInstance();
	    //calendar_date_time.add(Calendar.DAY_OF_YEAR,10);
	    //Date futuredatetime=calendar_date_time.getTime();
	    //System.out.println(futuredatetime);
	    //driver.close();
	    
	    //past date and time
	      Calendar calendar_date_time=Calendar.getInstance();
	      calendar_date_time.add(Calendar.DAY_OF_YEAR,-10);
	      Date pastdatetime=calendar_date_time.getTime();
	      System.out.println(pastdatetime);
	      driver.close();
	}

}
