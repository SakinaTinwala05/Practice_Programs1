package TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumPractice.TestPage;

public class TestExe {

	public static void main(String[] args) throws InterruptedException { 
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ecs\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login"); 
		
		TestPage t1 = new TestPage(driver); 
		
		t1.enterFirstName("Sakina");
		t1.clickButton();
		
	}

}
