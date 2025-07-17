package TestCase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.Assert;
import POM.CheckoutPage;
import POM.LoginPage;
import POM.ProductPage;
import Testsetup.basetest;
import utility.Excelutility;

public class LoginTest extends basetest {
	
//	@DataProvider(name = "excelData")
//    public Object[][] excelDataProvider() throws Exception {
//        String path = "C:\\Users\\LabsKraft\\eclipse-workspace\\A-Practice_Website\\src\\test\\java\\TestData\\Book11.xlsx";
//        return Excelutility.getExcelData(path, "Sheet1");
//    }

    @Test    //@Test(dataProvider = "excelData")
    public void testValidLogin() throws InterruptedException {
    	// testValidLogin(String username, String password,String firstName,String lastName,String postalCode)
        setUp();
        driver.get("https://www.saucedemo.com/");

        LoginPage loginPage = new LoginPage(driver);
        // loginPage.login(username, password); // for excel data
        loginPage.login("standard_user", "secret_sauce");
        
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        Thread.sleep(3000);
        
        ProductPage ProductPage = new ProductPage(driver);
        ProductPage.selectBackpackAndAddToCart();
        Thread.sleep(3000);
        
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();
        Assert.assertEquals(cartCount, "1", "Cart badge count should be 1");
        
        ProductPage.clickCheckout();
        Thread.sleep(3000);
        
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        //checkoutPage.fillCheckout(firstName, lastName, postalCode); // for excel data
        checkoutPage.fillCheckout("GHU", "t", "12344");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("back-to-products")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("logout_sidebar_link")).click();
    }
}
