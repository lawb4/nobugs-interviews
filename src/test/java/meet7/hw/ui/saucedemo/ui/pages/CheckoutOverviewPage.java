package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class CheckoutOverviewPage {
    private SelenideElement finishButton = element(Selectors.byId("finish"));

    public void clickFinishButton() {
        finishButton.click();
    }
}
