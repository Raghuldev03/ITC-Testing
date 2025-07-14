package Selenium_JavaITC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exclipit {
	// exclipit wait
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        // Step 3: Click the 'Start' button
        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
        startButton.click();
        // Step 4: Use Explicit Wait to wait for the result text to be visible
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement resultText = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
        );
        // Step 5: Print the result text
        System.out.println("Text appeared: " + resultText.getText());
        // Step 6: Close the browser
        driver.quit();
	}

}
