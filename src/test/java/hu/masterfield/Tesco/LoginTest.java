package hu.masterfield.Tesco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;

public class LoginTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void login() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        driver.findElement(By.cssSelector(".signin-register--signin-button > .button")).click();
        driver.findElement(By.id("email")).sendKeys("email1@email.com");
        driver.findElement(By.id("password")).sendKeys("password1");
        driver.findElement(By.cssSelector(".button > span")).click();

    }
}
