package auto.step;

import auto.element.testBaiDuElement;

import auto.publicM.ReadPrePerties;
import org.openqa.selenium.WebDriver;


import java.util.logging.LogManager;
import java.util.logging.Logger;

public class BaiBuStep {
    WebDriver driver;

    public BaiBuStep(WebDriver driver) {
        this.driver = driver;
    }

    public void testBaidu(){
        testBaiDuElement ele = new testBaiDuElement(driver);
        driver.get(ReadPrePerties.readGetKey("webUrl"));
        ele.inputB.sendKeys("李艳");
        try{
            Thread.sleep(3000);
        }catch (Exception e){
            e.printStackTrace();
        }

        ele.searchB.click();
    }


}
