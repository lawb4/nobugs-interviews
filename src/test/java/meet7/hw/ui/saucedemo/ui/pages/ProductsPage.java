package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.element;

@Data
public class ProductsPage {
    private final SelenideElement cartIcon = element(Selectors.byClassName("shopping_cart_link"));
    private final SelenideElement productsTitle = element(Selectors.byClassName("title"));

    public void addToCart(SelenideElement item) {
        item.click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }
}