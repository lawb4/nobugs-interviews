package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class CartPage {
    private SelenideElement checkoutButton = element(Selectors.byId("checkout"));

    public void clickCheckoutButton() {
        checkoutButton.click();
    }
}
