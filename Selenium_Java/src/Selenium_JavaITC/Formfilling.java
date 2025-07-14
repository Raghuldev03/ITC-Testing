package Selenium_JavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Formfilling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://practicetestautomation.com/practice-test-login");
		
		WebElement FieldBox1 = driver.findElement(By.name("username"));
		FieldBox1.clear();
		FieldBox1.sendKeys("student");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        WebElement FieldBox2 = driver.findElement(By.name("password"));
        FieldBox2.sendKeys("Password123");
        //FieldBox2.sendKeys(Keys.RETURN);
        
        WebElement FieldBox3 = driver.findElement(By.id("submit"));
        FieldBox3.click();
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Data Submitted");
        driver.quit();
        //id="submit"
	}

}
