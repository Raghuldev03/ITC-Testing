package TestCase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM.CheckoutPage;
import POM.CheckoutPage2;
import POM.LoginPage;
import POM.LogoutPage;
import POM.ProductPage;
import Testsetup.basetest;

public class LoginTest extends basetest {

    @DataProvider(name = "loginData", parallel = false)
    public Object[][] credentials() {
    	return new Object[][]{
            {"standard_user", "secret_sauce", "John",  "Doe",   "12345", true},
            {"",              "secret_sauce", "John",  "Doe",   "12345", false},
            {"standard_user", "",             "John",  "Doe",   "12345", false},
            {"wrong_user",    "wrong_pass",   "John",  "Doe",   "12345", false},
            {"standard_user", "secret_sauce", "",      "Doe",   "12345", false},  
            {"standard_user", "secret_sauce", "John",  "",      "12345", false},
            {"standard_user", "secret_sauce", "John",  "Doe",   "",      false},
            {"locked_out_user", "secret_sauce", "John", "Doe", "12345", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void fullEndToEndTest(String username, String password, String fn, String ln, String pc, boolean isValid) throws InterruptedException {
        
        setUp();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        System.out.println("\n=== 🔐 Starting test for: " + username + " | Expected: " + (isValid ? "VALID" : "INVALID") + " ===");
        driver.get("https://www.saucedemo.com/");
        
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        Thread.sleep(1000);
        
        String currentUrl = driver.getCurrentUrl();

        if (!isValid) {
            if (currentUrl.contains("inventory")) {
                System.out.println("❌ Unexpected login success for invalid input");
                Assert.fail("Invalid input should not land on dashboard");
            } else {
                System.out.println("✅ Properly handled invalid login or input. Stayed on login page: " + currentUrl);
            }
            driver.quit();
            return;
        }
        Assert.assertTrue(currentUrl.contains("inventory"), "❌ Login did not land on dashboard");
        System.out.println("✅ Landed on dashboard");

        ProductPage pg = new ProductPage(driver);
        pg.Productfunction();

        CheckoutPage cp = new CheckoutPage(driver);
        cp.checkoutfunction(fn, ln, pc);

        cp.checkout2();
        driver.findElement(By.id("checkout")).click();
        cp.checkoutfunction(fn, ln, pc);

        CheckoutPage2 cp2 = new CheckoutPage2(driver);
        cp2.Finish();

        LogoutPage Lp = new LogoutPage(driver);
        Lp.Backtohome();
        Lp.Logout();

        driver.quit();
    }
}