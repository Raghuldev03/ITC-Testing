package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CheckoutPage {
    private static WebDriver driver;

    private By firstNameField = By.id("first-name");
    private By lastNameField = By.id("last-name");
    private By postalCodeField = By.id("postal-code");
    private By continueButton = By.xpath("//input[@id='continue']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String firstName) throws InterruptedException {
        driver.findElement(firstNameField).sendKeys(firstName);
        Thread.sleep(2000);
    }

    public void enterLastName(String lastName) throws InterruptedException {
        driver.findElement(lastNameField).sendKeys(lastName);
        Thread.sleep(2000);
    }

    public void enterPostalCode(String postalCode) throws InterruptedException {
        driver.findElement(postalCodeField).sendKeys(postalCode);
        Thread.sleep(2000);
    }

    public void clickContinue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(continueButton)).click();
    }
    public void fillCheckout(String firstName, String lastName, String postalCode) throws InterruptedException {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterPostalCode(postalCode);
        clickContinue();
    }
}
