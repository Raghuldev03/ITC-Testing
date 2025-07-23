package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage2 {
	
	 private static WebDriver driver;
	 private By fnbtutton=By.xpath("//*[@id=\"finish\"]");
	 
	 private By itemTotalLocator = By.className("summary_subtotal_label");
	 private By taxLocator = By.className("summary_tax_label");
	 private By totalLocator = By.className("summary_total_label");
	 
	 public CheckoutPage2(WebDriver driver) {
	        CheckoutPage2.driver = driver;
	    }
	    
	public void Finish() throws InterruptedException {
    	String itemTotalText = driver.findElement(itemTotalLocator).getText();
        String taxText = driver.findElement(taxLocator).getText();
        String totalText = driver.findElement(totalLocator).getText();
        
        double itemTotal = Double.parseDouble(itemTotalText.replaceAll("[^0-9.]", ""));
        double tax = Double.parseDouble(taxText.replaceAll("[^0-9.]", ""));
        double total = Double.parseDouble(totalText.replaceAll("[^0-9.]", ""));
        boolean isTotalCorrect = Math.abs((itemTotal + tax) - total) < 0.01;
        System.out.println("✅ Total price calculation correct: " + isTotalCorrect);
        Thread.sleep(2000);
        
    	WebElement fnbtn=driver.findElement(fnbtutton);
    	String bgColor2 = fnbtn.getCssValue("background-color");
        String expectedBgColor2 = "rgba(61, 220, 145, 1)";
        boolean isBgColorMatch2 = bgColor2.trim().equals(expectedBgColor2);
        System.out.println("✅ Background color match for Finish Button button: " + isBgColorMatch2 + " | Actual color: " + bgColor2);
        fnbtn.click();
    	System.out.println("➡️ Finish Button clicked on Checkout page 2");
    	System.out.println("🛒 Navigated to Confirmation Page");
    	Thread.sleep(2000);
    }
}
