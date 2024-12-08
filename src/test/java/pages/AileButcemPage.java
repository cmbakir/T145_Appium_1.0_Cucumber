package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.Random;

public class AileButcemPage {
    ////*[@text='Giriş Yap']

    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(),Duration.ofSeconds(15)),this);}

    public void ilkekranAyarlari() throws InterruptedException {
        for (int i = 0; i < 6; i++) {
            Thread.sleep(2000);
            ReusableMethods.ekranKaydirmaMethodu(930,1200,500,130,1200);
        }
        ReusableMethods.scrollWithUiScrollableAndClick("Giriş Yap");
    }


    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement emailKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement sifreKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[2]")
    public MobileElement girisYapButonu;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public MobileElement girisYazisiDogrulama;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement HamburgerButonu;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[2]")
    public MobileElement hesabimButonu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yaskutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[2]")
    public MobileElement cinsiyetkutusu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[3]")
    public MobileElement kaydetbutonu;


    public void bilgitemizlemeMthodu (){
        isimkutusu.clear();
        soyisimkutusu.clear();
        sehirkutusu.clear();
        yaskutusu.clear();
        meslekkutusu.clear();
    }

    public  void bilgiYazmaMethodu(String isim, String soyisim, String sehir, String yas, String meslek, String cinsiyet) throws InterruptedException {
        bilgitemizlemeMthodu();
        Thread.sleep(2000);
        isimkutusu.sendKeys(ConfigReader.getProperty(isim));
        soyisimkutusu.sendKeys(ConfigReader.getProperty(soyisim));
        sehirkutusu.sendKeys(ConfigReader.getProperty(sehir));
        yaskutusu.sendKeys(ConfigReader.getProperty(yas));
        meslekkutusu.sendKeys(ConfigReader.getProperty(meslek));
        cinsiyetkutusu.click();
        Thread.sleep(4000);
        ReusableMethods.scrollWithUiScrollableAndClick(cinsiyet);
        Thread.sleep(2000);
        kaydetbutonu.click();
    }

    public void bilgiDogrulamamethodu(String isim, String soyisim, String sehir, String yas, String meslek, String cinsiyet) throws InterruptedException {
        Assert.assertTrue(isimkutusu.getText().equals(ConfigReader.getProperty(isim)));
        Assert.assertTrue(soyisimkutusu.getText().equals(ConfigReader.getProperty(soyisim)));
        Assert.assertTrue(sehirkutusu.getText().equals(ConfigReader.getProperty(sehir)));
        Assert.assertTrue(yaskutusu.getText().equals(ConfigReader.getProperty(yas)));
        Assert.assertTrue(meslekkutusu.getText().equals(ConfigReader.getProperty(meslek)));
        Thread.sleep(4000);
        Assert.assertTrue(cinsiyetkutusu.getText().equals("Kadın"));

    }









}
