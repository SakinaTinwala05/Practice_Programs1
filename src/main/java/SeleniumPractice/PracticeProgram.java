package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeProgram {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ecs\\Downloads\\chromedriver_win32\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407https://fs2.formsite.com/meherpavan/form2/index.html?1537702596407"); 

		WebElement uName = driver.findElement(By.xpath("//*[@id='RESULT_TextField-1']"));
	  	WebElement lName = driver.findElement(By.xpath("//*[@id='RESULT_TextField-2']"));
	  	WebElement phone = driver.findElement(By.xpath("//*[@id='RESULT_TextField-3']"));
	  	WebElement country = driver.findElement(By.xpath("//*[@id='RESULT_TextField-4']"));
	  	WebElement city = driver.findElement(By.xpath("//*[@id='RESULT_TextField-5']"));
	  	WebElement email = driver.findElement(By.xpath("//*[@id='RESULT_TextField-6']"));
	  	WebElement gender1 = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-7_0']"));
	  	WebElement gender2 = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-7_1']"));
	  	WebElement chBox1 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_0']"));
	  	WebElement chBox2 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_1']"));
	  	WebElement chBox3 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_2']"));
	  	WebElement chBox4 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_3']"));
	  	WebElement chBox5 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_4']"));
	  	WebElement chBox6 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_5']"));
	  	WebElement chBox7 = driver.findElement(By.xpath("//*[@id='RESULT_CheckBox-8_6']"));
	  	WebElement dropdown = driver.findElement(By.xpath("//*[@id='RESULT_RadioButton-9']"));
	  	WebElement file = driver.findElement(By.xpath("//*[@id='RESULT_FileUpload-10']"));
	  	WebElement submit = driver.findElement(By.xpath("//*[@id='FSsubmit']"));
	  	
	  	uName.sendKeys("Sakina");
	  	lName.sendKeys("Tinwala");
	  	phone.sendKeys("1234567890");
	  	country.sendKeys("India");
	  	city.sendKeys("Ahmedabad");
	  	email.sendKeys("Sakina12@gmail.com");
	  	gender1.sendKeys("Male");
	  	gender2.sendKeys("Female");
	  	chBox1.sendKeys("Sunday");
	  	chBox2.sendKeys("Monday");
	  	chBox3.sendKeys("Tuesday");
	  	chBox4.sendKeys("Wednesday");
	  	chBox5.sendKeys("Thursday");
	  	chBox6.sendKeys("Friday");
	  	chBox7.sendKeys("Saturday");
	  	dropdown.sendKeys("Morning");
	  	file.click();
	  	submit.click();
	  	
	  	String expected_title = "Selenium Practice Form";
        String actual_title = driver.getTitle();
        
        if (expected_title.equals(actual_title)) {
        	System.out.println("Login Successfull");
        }
        else {
        	System.out.println("Login Failed");
        }
	  	
	  	
	}

}
