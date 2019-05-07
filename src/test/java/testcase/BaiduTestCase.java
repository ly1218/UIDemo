package testcase;


import auto.publicM.BrowserDriver;

import auto.step.BaiBuStep;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BaiduTestCase {
    WebDriver driver;

    BrowserDriver dr = new BrowserDriver(driver);

    @BeforeTest
    public void beforeTest() {
        driver = dr.openDriver();
    }

    @Test
    public void test() {
        BaiBuStep step = new BaiBuStep(driver);
        step.testBaidu();
    }

    @AfterTest
    public void afterTest() {
        dr.closeDriver();
    }

}
