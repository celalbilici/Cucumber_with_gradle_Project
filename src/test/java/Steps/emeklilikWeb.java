package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class emeklilikWeb {
   public WebDriver driver = new ChromeDriver();

    @Given("su web \"(.*?)\" sayfasina giris yapalim")
    public void su_web_sayfasina_giris_yapalim(String link) throws Throwable {
        driver.get(link);
        Thread.sleep(3000);
        ((ChromeDriver) driver).findElementByName("ctl00$content$txtTCKN").sendKeys("44311003534");
        ((ChromeDriver) driver).findElementByName("ctl00$content$txtPhone").sendKeys("5512199188");
        Thread.sleep(10000);
        ((ChromeDriver) driver).findElementByClassName("pageLoginButton").click();
        //((ChromeDriver) driver).findElementByName("ctl00$content$txtSMS").sendKeys("");
        Thread.sleep(10000);
        ((ChromeDriver) driver).findElementById("btnEnter").click();



    }

    @And("\"(.*?)\" sekmesine tikladim")
    public void sekmesineTikladim(String arg0) throws Throwable{
        Thread.sleep(5000);
        ((ChromeDriver) driver).findElementByLinkText("İletişim Bilgilerim").click();
        Thread.sleep(5000);
        //List<WebElement> radio_button =  driver.findElement(By.cssSelector("input[name='cmbYazismaAdresi']"));
       // radio_button.get(2).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Evet'])[1]/following::input[1]")).click();
        driver.findElement(By.linkText("Güncelle")).click();
        new Select(driver.findElement(By.name("cmbIl"))).selectByVisibleText("İSTANBUL");
        driver.findElement(By.name("cmbIl")).click();
       Thread.sleep(3000);
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Önceki Sayfa'])[1]/following::div[2]")).click();
        driver.findElement(By.name("cmbIlce")).click();
        Thread.sleep(1000);
        new Select(driver.findElement(By.name("cmbIlce"))).selectByVisibleText("ESENLER");
        driver.findElement(By.name("semt")).click();
        driver.findElement(By.name("semt")).clear();
        driver.findElement(By.name("semt")).sendKeys("DAVUTPASA");
        driver.findElement(By.name("adres")).click();
        driver.findElement(By.name("adres")).clear();
        driver.findElement(By.name("adres")).sendKeys("YTU DAVUTPAŞA KAMPÜSÜ C2 BLOK ZIRAAT TEKNOLOJI AŞ");
        driver.findElement(By.linkText("Tamam")).click();



    }
}
