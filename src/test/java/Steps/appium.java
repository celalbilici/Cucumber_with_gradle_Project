package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Scanner;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;


public class appium {
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;


        @BeforeMethod
        @When("uygulamamizi cihazdan acalim")
        public void uygulamamiziCihazdanAcalim () throws MalformedURLException {
            DesiredCapabilities caps = new DesiredCapabilities();
            caps.setCapability("deviceName", "RF8K10LFYQB");
            caps.setCapability("udid", "ce11171b2301909e0d");
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "8.0");
            caps.setCapability("app", "C:\\Users\\celal\\Desktop\\Mobil sube_com.vizyoneks.ziraatemeklilik.apk");
            caps.setCapability("appPackage", "com.vizyoneks.ziraatemeklilik");
            caps.setCapability("appActivity", "com.vizyoneks.ziraatemeklilik.activity.MainNewActivity");
            driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
            wait = new WebDriverWait(driver, 10);

           // DesiredCapabilities capss = new DesiredCapabilities();
            //capss.setCapability("deviceName", "HB0SVZ81");
            //capss.setCapability("udid", "67ba9002");
           // capss.setCapability("platformName", "Android");
            //capss.setCapability("platformVersion", "7.0");
           // capss.setCapability("app", "C:\\Users\\celal\\Desktop\\Mobil sube_com.vizyoneks.ziraatemeklilik.apk");
            //capss.setCapability("appPackage", "com.vizyoneks.ziraatemeklilik");
          //  capss.setCapability("appActivity", "com.vizyoneks.ziraatemeklilik.activity.MainNewActivity");
           // driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4724/wd/hub"), capss);
          //  wait = new WebDriverWait(driver, 10);

        }
        @Test
        @When("^\"(.*?)\" tc ve \"(.*?)\" telefon bilgisi ile uygulamaya giris yapalim$")
        public void tcVeTelefonBilgisiIleUygulamayaGirisYapalim (String identity_number, String telephone_number) throws
        Throwable {
            driver.findElementById("top_band").click();
            driver.findElementById("login_tckno_edit_text").sendKeys(identity_number);
            driver.findElementById("login_phone_edit_text").sendKeys(telephone_number);
            Thread.sleep(10000);
        }


    @And("musteriye ait islemler goruntelenir")
    public void musteriyeAitIslemlerGoruntelenir() throws Throwable{
        Thread.sleep(3000);

        driver.findElementByAccessibilityId("Yan menüyü aç").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/txt_view_data_birikiminiz_amount").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/view_data_row_2").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/rdb_no").click();
        Thread.sleep(3000);

    }

    @And("login butonu kaydirilir")
    public void loginButonuKaydirilir() throws Throwable {
        new TouchAction(driver)
                .press(point(500,1168))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(500, 513))
                .release().perform();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/login_button").click();
        Thread.sleep(10000);
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/login_steptwo_button").click();



    }

    @And("katki payi degisikligi yapilir")
    public void katkiPayiDegisikligiYapilir() throws Throwable {
         //driver.findElementById("com.vizyoneks.ziraatemeklilik:id/btn_back").click();
        //driver.findElementByAccessibilityId("Yan menüyü aç").click();
       // driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.widget.LinearLayout[1]/android.widget.TextView").click();
        Thread.sleep(3000);
        driver.findElementByAccessibilityId("Yan menüyü aç").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/txt_view_odenen_toplam_tutar").click();
        Thread.sleep(2000);
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/layout_home_adress_header").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/btn_add_or_update_home_adress").click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.Button[2]").click();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/txt_adress").clear();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/txt_adress").sendKeys("Leblebi caddesi nohut sokak no:11");

        new TouchAction(driver)
                .tap(point(995,1792))
                .waitAction(waitOptions(Duration.ofMillis(250))).perform();
        driver.findElementById("com.vizyoneks.ziraatemeklilik:id/btn_save").click();
        driver.findElementById("android:id/button1").click();
        driver.findElementByAccessibilityId("Çıkış").click();
        driver.findElementById("android:id/button1").click();


    }

    @And("ve ne yapsa")
    public void veNeYapsa() {
    }
}

