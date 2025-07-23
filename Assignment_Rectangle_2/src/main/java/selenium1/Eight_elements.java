package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Eight_elements {
    public static void main(String[] args) {
        // Make sure the chromedriver path is correct or set it via system PATH
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\LabsKraft\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
        // First Name
        driver.findElement(By.id("firstName")).sendKeys("John");
        // Last Name
        driver.findElement(By.id("lastName")).sendKeys("Doe");
        // Email
        driver.findElement(By.id("userEmail")).sendKeys("johndoe@example.com");
        // Gender - Male
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        // Mobile Number
        driver.findElement(By.id("userNumber")).sendKeys("1234567890");
        // Date of Birth
        driver.findElement(By.id("dateOfBirthInput")).click();
        driver.findElement(By.className("react-datepicker__month-select")).sendKeys("May");
         driver.findElement(By.className("react-datepicker__year-select")).sendKeys("1990");
        driver.findElement(By.xpath("//div[contains(@class,'react-datepicker__day--015')]")).sendKeys("13");
        // Subjects
        WebElement subjectsInput = driver.findElement(By.id("subjectsInput"));
        subjectsInput.sendKeys("Maths");
        subjectsInput.sendKeys(Keys.ENTER);
        // Eighth Element: Hobbies - Select 'Sports'
        driver.findElement(By.xpath("//label[text()='Sports']")).click();
        driver.findElement(By.id("currentAddress")).sendKeys("Bangalore, Karnataka");
       driver.quit();
    }
}
