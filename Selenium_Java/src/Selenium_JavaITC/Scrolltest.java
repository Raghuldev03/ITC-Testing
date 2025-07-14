package Selenium_JavaITC;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolltest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/large");
		Thread.sleep(2000);
        // Step 3: Locate a target element near the bottom (e.g., "Powered by")
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='page-footer']"));
        // Step 4: Scroll to the element using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", targetElement);
        Thread.sleep(2000);
        // Step 5: Optional - Print some text from that section
        System.out.println("Scrolled to: " + targetElement.getText());
        // Step 6: Close browser
        driver.quit();
		
		
	}

}
