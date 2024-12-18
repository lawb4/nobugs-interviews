package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import meet7.hw.ui.saucedemo.utils.Helpers;

import static com.codeborne.selenide.Selenide.element;

public class CheckoutInformationPage {
    // Inputs
    private final SelenideElement firstNameInput = element(Selectors.byId("first-name"));
    private final SelenideElement lastNameInput = element(Selectors.byId("last-name"));
    private final SelenideElement zipPostalCodeInput = element(Selectors.byId("postal-code"));
    // Buttons
    private final SelenideElement continueButton = element(Selectors.byId("continue"));

    public void confirmInfoAndClickContinueButton() {
        firstNameInput.sendKeys(Helpers.randomString());
        lastNameInput.sendKeys(Helpers.randomString());
        zipPostalCodeInput.sendKeys(Helpers.randomString());

        continueButton.click();
    }
}
