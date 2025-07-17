package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
	
	private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    // Page actions
    public void enterUsername(String username) throws InterruptedException {
        driver.findElement(usernameField).sendKeys(username);
        Thread.sleep(3000);
    }
    public void enterPassword(String password) throws InterruptedException {
        driver.findElement(passwordField).sendKeys(password);
        Thread.sleep(3000);
    }
    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
    
    public void login(String user, String pass) throws InterruptedException {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}
