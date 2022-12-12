package hu.masterfield.Tesco;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
    public class RegistrationTest<WebElement> {
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
        public void registration() {
            driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU/");
            driver.manage().window().setSize(new Dimension(1552, 840));
            driver.findElement(By.cssSelector(".signin-register--register-button > .button")).click();
            driver.findElement(By.id("email")).click();
            driver.findElement(By.id("email")).sendKeys("email8@email.hu");
            driver.findElement(By.id("password")).sendKeys("password5");
            driver.findElement(By.id("confirm-password")).sendKeys("password5");
            driver.findElement(By.cssSelector(".button > span")).click();
            driver.findElement(By.id("county")).click();
            {
                WebElement dropdown = driver.findElement(By.id("county"));
                dropdown.findElement(By.xpath("//option[. = 'Budapest']")).click();
            }
            driver.findElement(By.id("municipality")).click();
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            {
                WebElement dropdown = driver.findElement(By.id("municipality"));
                dropdown.findElement(By.xpath("//option[. = 'Budapest 13']")).click();
            }
            driver.findElement(By.id("postcode")).click();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            {
                WebElement dropdown = driver.findElement(By.id("postcode"));
                dropdown.findElement(By.xpath("//option[. = '1134']")).click();
            }
            driver.findElement(By.id("street")).click();
            {
                WebElement dropdown = driver.findElement(By.id("street"));
                dropdown.findElement(By.xpath("//option[. = 'Taksony utca']")).click();
            }
            driver.findElement(By.id("housenumber")).click();
            {
                WebElement dropdown = driver.findElement(By.id("housenumber"));
                dropdown.findElement(By.xpath("//option[. = '5']")).click();
            }
            driver.findElement(By.id("freetext1")).click();
            driver.findElement(By.id("freetext1")).sendKeys("5");
            driver.findElement(By.id("nickname")).sendKeys("Cím1");
            driver.findElement(By.cssSelector(".button > span")).click();
            driver.findElement(By.id("firstName")).click();
            driver.findElement(By.id("firstName")).sendKeys("Judit");
            driver.findElement(By.id("lastName")).sendKeys("Lövitusz");
            driver.findElement(By.id("primaryPhone")).sendKeys("0036303913064");
            driver.findElement(By.id("secondaryPhone")).sendKeys("00365953527");
            driver.findElement(By.cssSelector(".checkbox-label:nth-child(4)")).click();
            driver.findElement(By.cssSelector(".display-only-in-js .button")).click();
        }
    }
    
}
