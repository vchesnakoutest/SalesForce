package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.NewAccountModalPage;

import java.util.concurrent.TimeUnit;

public class AccountTests {

    public static final String URL = "https://pandadoc9.my.salesforce.com";
    public static final String LOGIN = "vctest123-xhfr@force.com";
    public static final String PASSWORD = "Gq2KPsXekAb*ySd%";

    @Test
    public void createAccountTest() {
        //driver settings
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //login
        driver.get(URL);
        driver.findElement(By.id("username")).sendKeys(LOGIN);
        driver.findElement(By.id("password")).sendKeys(PASSWORD);
        driver.findElement(By.id("Login")).click();
        //open new account modal
        NewAccountModalPage newAccountModalPage = new NewAccountModalPage(driver);
        newAccountModalPage.openPage();
        newAccountModalPage.create("Automation Account", "www.tut.by");
        //TODO: Implement asserts
    }
}
