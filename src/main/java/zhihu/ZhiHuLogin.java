package zhihu;

import AppiumDriver.AppiumUtils;
import AppiumDriver.InitDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import java.util.List;

public class ZhiHuLogin {
    AndroidDriver<AndroidElement> driver;

    public ZhiHuLogin(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public void login() throws Exception {
        Thread.sleep(5000);
        driver.findElementById("com.zhihu.android:id/go_to_btn").click();
        Thread.sleep(3000);
        driver.findElementById("com.zhihu.android:id/email_input_view").sendKeys("15001885109");
        driver.findElementById("com.zhihu.android:id/password").sendKeys("liyan33@##");
        driver.findElementById("com.zhihu.android:id/btn_progress").click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(driver.getPageSource());
        if (driver.getPageSource().contains("推荐")) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        driver.findElementByXPath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/*[1]").click();
        Thread.sleep(3000);
    }

    public void attention () throws Exception{
        //*[@resource-id='com.zhihu.android:id/title']
        //*[@resource-id='com.zhihu.android:id/title']
        List<AndroidElement> lists=driver.findElementsByXPath("//*[@resource-id='com.zhihu.android:id/title']");
        //*[@text='关注']
        for(AndroidElement t:lists){
            String title=t.getText();
            System.out.println(title);
            t.click();
            Thread.sleep(5000);
            try{
              // driver.findElementByXPath("//*[@text='关注']").click();
              //  driver.findElementByName("关注").click();
               // driver.findElementByXPath("//*[android.widget.Button]").click();
            driver.findElementByAndroidUIAutomator("new UiSelector().description('关注')").click();
              //  driver.findElementByXPath(("//android.widget.Button[@content-desc='关注']"));
               // driver.findElementByName("关注").click();
               // driver.findElementByXPath("").click();
            }catch(Exception e){
                System.out.println("没找到，继续关注");
            }
            Thread.sleep(2000);
            driver.pressKeyCode(4);
            Thread.sleep(1000);

        }



    }
  //根据Xpath
    public void loginByXpath() throws Exception{

        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@resource-id='com.zhihu.android:id/go_to_btn']")).click();

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@resource-id='com.zhihu.android:id/email_input_view']")).sendKeys("15001885109");

        driver.findElement(By.xpath("//*[@resource-id='com.zhihu.android:id/password']")).sendKeys("liyan33@##");
        driver.findElement(By.xpath("//*[@resource-id='com.zhihu.android:id/btn_progress']")).click();

        driver.findElementByXPath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/*[1]").click();


    }

    public void clickMenu(int order){
        if(order>0&&order<6)
       driver.findElementByXPath("//android.widget.HorizontalScrollView/android.widget.LinearLayout/*["+order+"]").click();
    }

    public void loginByUiAutomator() throws Exception{
      //  river.findElementByAndroidUIAutomator("new UiSelector().text(\"不再提醒\")").click();
        Thread.sleep(5000);
        driver.findElementByAndroidUIAutomator("new UiSelector().text(\"密码登录\")").click();
        Thread.sleep(3000);
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.zhihu.android:id/email_input_view\")").sendKeys("15001885109");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.zhihu.android:id/password\")").sendKeys("liyan33@##");
        driver.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.zhihu.android:id/btn_progress\")").click();


    }
        public static void main(String[] args) throws Exception{
            AndroidDriver<AndroidElement> driver=InitDriver.intDriver();
          //  ZhiHuLogin	zhihu=new ZhiHuLogin(driver);
         //   zhihu.login();
        //    zhihu.loginByUiAutomator();
           // Thread.sleep(3000);
           // zhihu.loginByXpath();
           // zhihu.clickMenu(1);
            //zhihu.clickMenu(4);
           // zhihu.clickMenu(2);
           // zhihu.clickMenu(3);
           // zhihu.clickMenu(1);
          //  zhihu.clickMenu(5);
          //  zhihu.attention();

          //  AppiumUtils.swipeToUp(driver,1000);
            Thread.sleep(5000);
            driver.quit();
        }
    }
