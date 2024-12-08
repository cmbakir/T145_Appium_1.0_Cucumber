package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.Driver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class APKYuklemeStepDef {

    AndroidDriver<AndroidElement>androidDriver;
    //AndroidDriver driver= Driver.getAndroidDriver();
    //<AndroidElement> bu sekilde calismak kod güvenligini artirir, sadece elementlere gider driver, bu yöntemi tercih ediyoruz

    @Given("Kulanici {string} uygulamayi cihazina yukler")
    public void kulanici_uygulamayi_cihazina_yukler(String ApkDosyaYolu) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel");//cihazimizin adi
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android"); //isletim sistemi
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0"); //versiyonu biz 10 sectik
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");//android kullandigimiz icin UiAutomator2, IOS icin XCUITest kullanilir
        caps.setCapability(MobileCapabilityType.APP, ApkDosyaYolu);

       androidDriver= new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
}
