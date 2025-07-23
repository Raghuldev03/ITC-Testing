package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogoutPage {
    private static WebDriver driver;

    private By backHomeButton = By.xpath("//*[@id='back-to-products']");
    private By menuButton = By.xpath("//*[@id='react-burger-menu-btn']");
    private By logoutLink = By.xpath("//*[@id='logout_sidebar_link']");

    public LogoutPage(WebDriver driver) {
        LogoutPage.driver = driver;
    }

    public void Backtohome() throws InterruptedException {
        String expectedUrl = "https://www.saucedemo.com/checkout-complete.html";
        String actualUrl = driver.getCurrentUrl();
        boolean isUrlMatch = actualUrl.equals(expectedUrl);
        System.out.println("✅ Landed on confirmation page: " + isUrlMatch);

        WebElement backBtn = driver.findElement(backHomeButton);
        String actualBgColor = backBtn.getCssValue("background-color");
        String expectedBgColor = "rgba(61, 220, 145, 1)";
        boolean isBgColorMatch = actualBgColor.trim().equals(expectedBgColor);

        System.out.println("✅ Background color match for Back Home button: " + isBgColorMatch + " | Actual: " + actualBgColor);
        backBtn.click();
        System.out.println("➡️ Back Home button clicked. Navigating to product/dashboard page.");
        Thread.sleep(2000);
    }

    public void Logout() throws InterruptedException {
        String expectedDashboardUrl = "https://www.saucedemo.com/inventory.html";
        String currentUrl = driver.getCurrentUrl();
        boolean isOnDashboard = currentUrl.equals(expectedDashboardUrl);
        System.out.println("✅ On dashboard before logout: " + isOnDashboard);

        WebElement menuBtn = driver.findElement(menuButton);
        menuBtn.click();
        System.out.println("📖 Menu opened.");
        Thread.sleep(1000);

        WebElement logoutBtn = driver.findElement(logoutLink);
        String logoutColor = logoutBtn.getCssValue("color");
        String expectedColor = "rgba(24, 88, 58, 1)";
        boolean isColorCorrect = logoutColor.trim().equals(expectedColor);

        System.out.println("✅ Logout button color match: " + isColorCorrect + " | Actual: " + logoutColor);

        logoutBtn.click();
        System.out.println("🔓 Logout button clicked.");
        Thread.sleep(2000);

        String expectedLoginUrl = "https://www.saucedemo.com/";
        String finalUrl = driver.getCurrentUrl();
        boolean isLoggedOut = finalUrl.equals(expectedLoginUrl);
        System.out.println("✅ Successfully logged out: " + isLoggedOut);
    }
}
