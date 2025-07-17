package Testsetup;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basetest {
protected WebDriver driver;
    
public void setUp() {
    WebDriverManager.chromedriver().setup();
    ChromeOptions options = new ChromeOptions();
    Map<String, Object> prefs = new HashMap<>();
    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);
    options.setExperimentalOption("prefs", prefs);
    options.addArguments("--disable-save-password-bubble");
    options.addArguments("disable-password-manager-reauthentication");
    
    driver = new ChromeDriver(options);  // <=== Pass options here!
    driver.manage().window().maximize();
}

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
