package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.OBiletPage;
import utilities.BrowserDriver;
import utilities.ConfigReader;

public class BrowserStepDef {

    OBiletPage page=new OBiletPage();

    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");
    }

    @Given("{string} sayfasina gider")
    public void sayfasina_gider(String url) {
        BrowserDriver.getBrowserDriver().get(ConfigReader.getProperty(url));
    }

    @Then("Avantajli urunler icon u oldugunu dogrular")
    public void avantajli_urunler_icon_u_oldugunu_dogrular() throws InterruptedException {
       // BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@src='https://images.hepsiburada.net/banners/s/1/104-104/IMAGE-BADGE-EnAvantajli133709686739364322.png'])[1]").isDisplayed();
        Assert.assertTrue("Icon",BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@src='https://images.hepsiburada.net/banners/s/1/104-104/IMAGE-BADGE-EnAvantajli133709686739364322.png'])[1]").isDisplayed());
        Thread.sleep(3000);
    }

    @Then("Avantajli urunler listesinin acildigini dogrular")
    public void avantajli_urunler_listesinin_acildigini_dogrular() throws InterruptedException {
        BrowserDriver.getBrowserDriver().findElementByXPath("//*[@class='qH_pRYFHPPhysIv9_jmv']").click();
        Thread.sleep(3000);
       Assert.assertTrue("Liste",BrowserDriver.getBrowserDriver().findElementByXPath("(//*[@class='qdMNev3VofCQljkpMTKi hb-button__content'])[1]") .isDisplayed());
    }

    @When("Dil türkce secilir")
    public void dil_türkce_secilir() throws InterruptedException {
        page.hamburgerMenu.click();
        page.dilSecenegibutonu.click();
        Thread.sleep(3000);
        page.Turkcebutonu.click();
    }
    @When("Para birimi TL secilir")
    public void para_birimi_tl_secilir() throws InterruptedException {
        page.hamburgerMenu.click();
        page.paraBirimiSecenegibutonu.click();
        Thread.sleep(3000);
        page.TLSecenegi.click();

    }
    @When("Otobus bul a tiklanir")
    public void otobus_bul_a_tiklanir() {
        page.aramaButonu.click();

    }
    @Then("Gelen bilet fiyatinin tl para birimi oldugu dogrulanir")
    public void gelen_bilet_fiyatinin_tl_para_birimi_oldugu_dogrulanir() {
        String TL= page.TRfiyatbilgisi.getText();
        Assert.assertTrue(TL.equals("TL"));

    }







}

