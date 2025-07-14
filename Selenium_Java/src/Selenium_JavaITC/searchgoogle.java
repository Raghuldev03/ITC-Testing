package Selenium_JavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchgoogle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Cars"); // inputs to search
        searchBox.sendKeys(Keys.RETURN);  // Press Enter key
        // Step 3: Wait briefly for results to load (you can use WebDriverWait for better wait)
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        // Step 4: Print the title of the results page
        System.out.println("Results Page Title: " + driver.getTitle());
        // Step 5: Close the browser
        driver.quit();

	}

}
