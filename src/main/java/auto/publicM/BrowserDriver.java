package auto.publicM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BrowserDriver {
    WebDriver webdriver;

    RunDriver driver = new RunDriver();

    public WebDriver openDriver() {
        System.setProperty("webdriver.chrome.driver", driver.pathChromeDriver);
        this.webdriver = new ChromeDriver();
        webdriver.manage().window().maximize();
        return webdriver;

    }

    public WebDriver closeDriver() {
        this.webdriver.quit();
        return null;
    }

    public BrowserDriver(WebDriver driver) {
        this.webdriver = driver;
    }
}
