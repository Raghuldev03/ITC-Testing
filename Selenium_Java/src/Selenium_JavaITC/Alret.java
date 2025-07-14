package Selenium_JavaITC;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alret {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement Alretbox = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
		Alretbox.click();
		Thread.sleep(2000);
		Alert alert1=driver.switchTo().alert(); // alert class
		System.out.println("Alert says: " + alert1.getText());
        alert1.accept(); // Accept the alert
        Thread.sleep(1000);
        // confirmation box
        WebElement jsConfirmBtn = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        jsConfirmBtn.click();
        Thread.sleep(1000);
        Alert alert2 = driver.switchTo().alert();
        System.out.println("Confirmation says: " + alert2.getText());
        alert2.dismiss(); // Dismiss the alert
        Thread.sleep(1000);
        // -------- Handle JavaScript Prompt (Send Keys + Accept) --------
        WebElement jsPromptBtn = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        jsPromptBtn.click();
        Thread.sleep(1000);
        Alert alert3 = driver.switchTo().alert();
        System.out.println("Prompt says: " + alert3.getText());
        alert3.sendKeys("Selenium User");
        alert3.accept(); // Accept after entering text
        Thread.sleep(9000);
        
     // Print result text
        String resultText = driver.findElement(By.id("result")).getText();
        System.out.println("Final Result: " + resultText);

	}

}
