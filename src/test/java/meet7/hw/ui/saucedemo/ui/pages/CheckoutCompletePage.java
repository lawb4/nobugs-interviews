package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.element;

@Data
public class CheckoutCompletePage {
    // Containers
    private SelenideElement checkoutCompleteContainer
            = element(Selectors.byId("checkout_complete_container"));
    //Buttons
    private SelenideElement backHomeButton = element(Selectors.byId("back-to-products"));

    public void clickBackHomeButton() {
        backHomeButton.click();
    }
}
