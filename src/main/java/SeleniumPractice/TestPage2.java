package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestPage2 {

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ecs\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&"); 
	
	    //Locating web element
	  	WebElement uName = driver.findElement(By.xpath("//*[@id='ap_email']"));
	  	WebElement pswd = driver.findElement(By.xpath("//*[@id='ap_password']"));
	  	WebElement loginBtn = driver.findElement(By.xpath("//*[@id='continue']"));
	  	WebElement loginBtn2 = driver.findElement(By.xpath("//*[@id='signInSubmit']"));
	  	
	    //Performing actions on web elements
	    uName.sendKeys("Sakina12@gmail.com");
	  	pswd.sendKeys("Sakina@523");
	  	loginBtn.click();
	  	loginBtn2.click();
		
        /*String expected_title = "Amazon";
        String actual_title = driver.getTitle();
        
        if (expected_title.equals(actual_title)) {
        	System.out.println("Login Successfully");
        }
        else {
        	System.out.println("Login Failed");
        }*/
	  	
	}
}
