package Selenium_JavaITC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googletest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//LabsKraft//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println("Title: "+ driver.getTitle());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();		

	}

}
