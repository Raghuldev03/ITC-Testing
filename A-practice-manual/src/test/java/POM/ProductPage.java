package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class ProductPage {
	private WebDriver driver;

    private By Productlink = By.id("item_4_title_link");
    private By addToCartButton = By.xpath("//button[contains(@id,'add-to-cart')]");
    private By backtoproduct = By.xpath("//*[@id=\"back-to-products\"]");
    private By Productlink2 = By.id("item_5_title_link");
    private By carticon=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private By continueshoping =By.xpath("//*[@id=\"continue-shopping\"]");
    private By itemremove=By.xpath("//*[@id=\"remove-sauce-labs-bike-light\"]");
    private By ckbtn=By.id("checkout");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void Productfunction() throws InterruptedException {
        WebElement link = driver.findElement(Productlink);
        String linkText = link.getText();                  
        link.click();    
        System.out.println("➡️ Product clicked " + linkText);
        Thread.sleep(2000);
        
        driver.findElement(addToCartButton).click();
        System.out.println("[+] Product added to cart: "+linkText);
        Thread.sleep(2000);
        
        WebElement back = driver.findElement(backtoproduct);
        String colorValue = back.getCssValue("color");
        boolean isColorMatch = colorValue.contains("24, 88, 58");
        System.out.println("✅ Color match for back to product test : " + isColorMatch +" Actual color : "+colorValue);
        back.click();
        Thread.sleep(2000);
        
        WebElement link2 = driver.findElement(Productlink2);
        String linkText2 = link2.getText();                  
        link2.click();    
        System.out.println("➡️ Product clicked " + linkText2);
        Thread.sleep(2000);
        
        driver.findElement(addToCartButton).click();
        System.out.println("[+] Product added to cart : " + linkText2);
        Thread.sleep(2000);
        
        WebElement carticonclick = driver.findElement(carticon);
        carticonclick.click();
        Assert.assertTrue(driver.getCurrentUrl().contains("cart"), "❌ did not land on cart page");
        System.out.println("🛒 Landed or Navigated to Cart page");
        Thread.sleep(2000);
        
        WebElement clickcontinue = driver.findElement(continueshoping);
        clickcontinue.click();
        System.out.println("➡️ Continue Button clicked on cart page");
        System.out.println("🛒 Navigated to Dashboard page");
        Thread.sleep(2000);
        
        WebElement carticonclick2 = driver.findElement(carticon);
        carticonclick2.click();
        System.out.println("🛒 Navigated to Cart page");
        Thread.sleep(2000);
        
        WebElement remove =driver.findElement(By.xpath("//*[@id=\"remove-sauce-labs-backpack\"]"));
        String linkText3 = remove.getText();
        remove.click();
        System.out.println("❌ Removed item : "+linkText3);
        Thread.sleep(2000);
        
        WebElement checkoutbtn = driver.findElement(ckbtn);
        String bgColor = checkoutbtn.getCssValue("background-color");
        String expectedBgColor = "rgba(61, 220, 145, 1)";
        boolean isBgColorMatch = bgColor.trim().equals(expectedBgColor);
        System.out.println("✅ Background color match for checkout button: " + isBgColorMatch + " | Actual color: " + bgColor);
        checkoutbtn.click();
        System.out.println("➡️ Checkout Button clicked on cart page");
        System.out.println("🛒 Navigated to Checkout page");
        Thread.sleep(3000);
        
        
    }

}
