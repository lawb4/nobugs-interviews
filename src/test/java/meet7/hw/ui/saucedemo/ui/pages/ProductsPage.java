package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class ProductsPage {

    private final SelenideElement cartIcon = element(Selectors.byClassName("shopping_cart_link"));

    public void addToCart(SelenideElement item) {
        item.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}