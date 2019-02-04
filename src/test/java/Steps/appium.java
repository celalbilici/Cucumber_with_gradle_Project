package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;



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

        }
        @Test
        @When("^\"(.*?)\" tc ve \"(.*?)\" telefon bilgisi ile uygulamaya giris yapalim$")
        public void tcVeTelefonBilgisiIleUygulamayaGirisYapalim (String identity_number, String telephone_number) throws
        Throwable {
            driver.findElementById("top_band").click();
            driver.findElementById("login_tckno_edit_text").sendKeys(identity_number);
            driver.findElementById("login_phone_edit_text").sendKeys(telephone_number);
            //throw new PendingException();
        }


    }

