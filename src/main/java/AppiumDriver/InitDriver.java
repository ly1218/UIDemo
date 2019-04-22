package AppiumDriver;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

public class InitDriver {
    public static AndroidDriver<AndroidElement> intDriver() throws Exception {
        File app = new File("C:\\Users\\ASUS\\Desktop\\zhihu.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Andr");//启动哪种设备，模拟器或者真机
        cap.setCapability("platformName", "Android");
        cap.setCapability("app", app.getAbsolutePath());//使用哪种自动化
        cap.setCapability("unicodeKeyboard", true);
        cap.setCapability("resetKeyboard", true);
        cap.setCapability("noSign", true);
        cap.setCapability("appPackage", "com.zhihu.android");
        cap.setCapability("udid", "4294d28a7d34");
        cap.setCapability("appActivity", "com.zhihu.android.app.ui.activity.LauncherActivity");

        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        return driver;
    }


    public static void main(String[] arg) throws Exception {
        InitDriver.intDriver();
    }

}

