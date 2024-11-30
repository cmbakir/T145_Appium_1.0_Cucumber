
package stepDefinitions;

import io.cucumber.java.en.Given;
import utilities.BrowserDriver;

public class BrowserStepDef {
    @Given("Kullanici hepsiburada adresine gider")
    public void kullanici_hepsiburada_adresine_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.hepsiburada.com");

    }
}
