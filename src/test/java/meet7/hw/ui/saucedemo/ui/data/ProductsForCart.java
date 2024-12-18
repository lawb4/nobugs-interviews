package meet7.hw.ui.saucedemo.ui.data;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.element;

@Data
public class ProductsForCart {

    private SelenideElement sauceLabsBackPackAddToCartButton
            = element(Selectors.byId("add-to-cart-sauce-labs-backpack"));

    private SelenideElement sauceLabsBoltTshirAddToCartButton
            = element(Selectors.byId("add-to-cart-sauce-labs-bolt-t-shirt"));

}