package auto.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class testBaiDuElement {
    WebDriver driver;


    @FindBy(xpath = ".//*[@id='kw']")
    public WebElement inputB;


    @FindBy(xpath = ".//*[@id='su']")
    public WebElement searchB;

    //构造函数初始化元素
    public testBaiDuElement(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
