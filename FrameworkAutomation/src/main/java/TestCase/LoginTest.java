package TestCase;

import POM.LoginPage;
import Testsetup.basetest;

public class LoginTest extends basetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTest test = new LoginTest();
        test.setUp();
        test.driver.get("https://practicetestautomation.com/practice-test-login/");
        LoginPage loginPage = new LoginPage(test.driver);
        loginPage.login("student", "Password123");
        // You can add validations here
        String currentUrl = test.driver.getCurrentUrl();
        System.out.println("Login success. Navigated to: " + currentUrl);
        test.tearDown();
	}

}

