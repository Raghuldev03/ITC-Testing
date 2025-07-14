package Selenium_JavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/login");
		
		WebElement FieldBox1 = driver.findElement(By.name("username"));
		FieldBox1.clear();
		FieldBox1.sendKeys("tomsmith");
		Thread.sleep(2000);
		WebElement FieldBox2 = driver.findElement(By.name("password"));
	    FieldBox2.sendKeys("SuperSecretPassword!");
	    
	    WebElement FieldBox3 = driver.findElement(By.xpath("//button[@type='submit']"));
        FieldBox3.click();
        Thread.sleep(8000);
        System.out.println("Data Submitted");
        driver.quit();
	}

}
