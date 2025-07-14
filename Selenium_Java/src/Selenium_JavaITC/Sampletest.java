package Selenium_JavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampletest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
		
		WebElement FieldBox1 = driver.findElement(By.name("username"));
		FieldBox1.clear();
		FieldBox1.sendKeys("Raghul");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        WebElement FieldBox2 = driver.findElement(By.name("password"));
        FieldBox2.sendKeys("Raghul@03");
        FieldBox2.sendKeys(Keys.RETURN);
       
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        System.out.println("Data Submitted");
        driver.quit();
        
	}

}
