package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestPage {

	By firstName = By.id("TextField-1");
		
	WebDriver driver;
	
	public TestPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterFirstName(String name ) {
		driver.findElement(firstName).sendKeys(name);
	}
	
	public void clickButton() {
		driver.findElement(firstName).click();
	}
	
}
