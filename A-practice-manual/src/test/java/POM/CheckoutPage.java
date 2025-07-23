package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage {
    private static WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continuebtn = By.xpath("//*[@id=\"continue\"]");
    private By Canclebtn =By.xpath("//*[@id=\"cancel\"]");
    private By carticon=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
   

    public CheckoutPage(WebDriver driver) {
        CheckoutPage.driver = driver;
    }

    public void checkoutfunction(String fn, String ln, String pc) throws InterruptedException {

        String expectedUrl = "https://www.saucedemo.com/checkout-step-one.html";
        String actualUrl = driver.getCurrentUrl();
        boolean isUrlMatch = actualUrl.equals(expectedUrl);
        System.out.println(isUrlMatch);

        WebElement fname = driver.findElement(firstNameField);
        fname.clear();
        fname.sendKeys(fn);
        System.out.println("👤 First Name : " + fn);
        Thread.sleep(1000);

        WebElement lname = driver.findElement(lastNameField);
        lname.clear();
        lname.sendKeys(ln);
        System.out.println("👤 Last Name : " + ln);
        Thread.sleep(1000);

        WebElement postc = driver.findElement(postalCodeField);
        postc.clear();
        postc.sendKeys(pc);
        System.out.println("🔐 Postal Code: " + pc);
        Thread.sleep(1000);
        
        if(!fn.isEmpty() && !ln.isEmpty() && !pc.isEmpty()) {
            System.out.println("✅ Checkout details filled successfully.");
        }else {
        	System.out.println("✅ Checkout details Not filled.");
        }
        
        WebElement cbtn = driver.findElement(continuebtn);
        String bgColor1 = cbtn.getCssValue("background-color");
        String expectedBgColor1 = "rgba(61, 220, 145, 1)";
        boolean isBgColorMatch1 = bgColor1.trim().equals(expectedBgColor1);
        System.out.println("✅ Background color match for Continue button: " + isBgColorMatch1 + " | Actual color: " + bgColor1);
        cbtn.click();
        System.out.println("➡️ Continue Button clicked on Checkout page");
        Thread.sleep(1000);
        
        String expectedUrl1 = "https://www.saucedemo.com/checkout-step-two.html";
        String actualUrl1 = driver.getCurrentUrl();
        boolean isUrlMatch1 = actualUrl1.equals(expectedUrl1);
        System.out.println("Url matched landed on Checkout overview : "+isUrlMatch1);
        Thread.sleep(1000);
    }
    
    public void checkout2() throws InterruptedException {
    	
    	WebElement cnlbtn=driver.findElement(Canclebtn);
        cnlbtn.click();
        System.out.println("➡️ Cancle Button clicked on Checkout page 2");
        System.out.println("🛒 Navigated to DashBoard page");
        Thread.sleep(2000);
        
        WebElement carticonclick2 = driver.findElement(carticon);
        carticonclick2.click();
        System.out.println("🛒 Navigated to Cart page");
        Thread.sleep(2000);
    }
}
