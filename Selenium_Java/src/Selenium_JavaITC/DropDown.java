package Selenium_JavaITC;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement FieldBox1 = driver.findElement(By.id("dropdown"));
		Select select = new Select(FieldBox1);
		 select.selectByVisibleText("Option 1");
	        System.out.println("Selected by visible text: Option 1");
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // Step 5: Select option by index (2 = Option 2, index starts at 0)
	        select.selectByIndex(2);
	        System.out.println("Selected by index: Option 2");
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // Step 6: Select option by value
	        select.selectByValue("1");
	        System.out.println("Selected by value: 1 (Option 1)");
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        // Step 7: Close browser
	        driver.quit();
	}

}
