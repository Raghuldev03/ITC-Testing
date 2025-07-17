package POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    private WebDriver driver;

    private By Productlink = By.xpath("//div[normalize-space()='Sauce Labs Backpack']");
    private By addToCartButton = By.xpath("//button[contains(@id,'add-to-cart')]");
    private By checkoutButton = By.xpath("//button[@id='checkout']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openProduct() throws InterruptedException {
        driver.findElement(Productlink).click();
        Thread.sleep(4000);
    }

    public void addToCart() throws InterruptedException {
        driver.findElement(addToCartButton).click();
        Thread.sleep(4000);
    }
    public void clickCartIcon() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }
    public void selectBackpackAndAddToCart() throws InterruptedException {
    	openProduct();
        addToCart();
        clickCartIcon();
    }
    public void clickCheckout() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton)).click();
    }
}
