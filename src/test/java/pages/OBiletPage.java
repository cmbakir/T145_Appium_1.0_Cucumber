package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserDriver;
import utilities.Driver;

import java.time.Duration;

public class OBiletPage {
    public OBiletPage() {
        PageFactory.initElements(BrowserDriver.getBrowserDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='sidebar toggle'])[1]")
    public WebElement hamburgerMenu;

    @FindBy(xpath = "//*[@class='language']")
    public WebElement dilSecenegibutonu;

    @FindBy(xpath = "(//*[@data-language='tr-TR'])[1]")
    public WebElement Turkcebutonu;

    @FindBy(xpath = "//*[@title='Currency Select']")
    public WebElement paraBirimiSecenegibutonu;

    @FindBy(xpath = "(//*[@data-code='TRY'])[1]")
    public WebElement TLSecenegi;

    @FindBy(xpath = "//*[@id='search-button']")
    public WebElement aramaButonu;

    @FindBy(xpath = "(//span[@class='amount-sign'])[1]")
    public WebElement TRfiyatbilgisi;





}
