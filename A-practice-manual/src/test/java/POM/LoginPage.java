package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    private By username = By.id("user-name");
    private By password = By.id("password");
    private By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String user, String pass) throws InterruptedException {
    	
        driver.findElement(username).clear();
        driver.findElement(username).sendKeys(user);
        System.out.println("👤 Username entered: " + user);
        Thread.sleep(1000);

        driver.findElement(password).clear();
        driver.findElement(password).sendKeys(pass);
        System.out.println("🔐 Password entered");
        Thread.sleep(1000);

        driver.findElement(loginBtn).click();
        System.out.println("🔓 Clicked Login");
        Thread.sleep(1000);
    }
}
