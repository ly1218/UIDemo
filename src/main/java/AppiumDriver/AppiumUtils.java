package AppiumDriver;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import org.openqa.selenium.By;

public class AppiumUtils {

   //清除
    public static void clear(AndroidDriver<AndroidElement> driver, AndroidElement e) throws Exception {
        e.click();
        String text = e.getText();
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_MOVE_END);
        for (int i = 0; i < text.length(); i++) {
            Thread.sleep(3000);
            driver.pressKeyCode(AndroidKeyCode.BACKSPACE);
        }

    }

    //密码输入
    public static void clearT(AndroidDriver<AndroidElement> driver, AndroidElement e) throws Exception {
        e.click();
        //String text = e.getText();
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_MOVE_END);
        for (int i = 0; i < 20; i++) {
            Thread.sleep(3000);
            driver.pressKeyCode(AndroidKeyCode.BACKSPACE);
        }

    }
     //删除
    public static void clearAndSendKeys(AndroidDriver<AndroidElement> driver, By by, String value) throws Exception {
        AndroidElement e = driver.findElement(by);
        e.click();
        String text = e.getText();
        driver.pressKeyCode(AndroidKeyCode.KEYCODE_MOVE_END);
        for (int i = 0; i < text.length(); i++) {
            Thread.sleep(3000);
            driver.pressKeyCode(AndroidKeyCode.BACKSPACE);
        }
        e.sendKeys(value);
    }

    /**
     * 向上滑动
     * @param driver
     * @param duration
     */

    public static void swipeToUp(AndroidDriver<AndroidElement> driver,int duration){
    int x=driver.manage().window().getSize().getWidth();
    int y=driver.manage().window().getSize().getHeight();
	//	driver.swipe(x/2, 8*y/10, x/2, y/10, duration);

}


    /**
     * 向下滑动
     * @param driver
     * @param duration
     */
    public static void swipeToDown(AndroidDriver<AndroidElement> driver,int duration){
        int x=driver.manage().window().getSize().getWidth();
        int y=driver.manage().window().getSize().getHeight();
       // driver.swipe(x/2, y/10, x/2, 8*y/10, duration);
    }


    // 判断元素存在不
    public static boolean isElementExists(AndroidDriver<AndroidElement> driver, By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

}

