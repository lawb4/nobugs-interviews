package meet7.hw.ui.saucedemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import meet7.hw.ui.saucedemo.ui.data.Account;
import meet7.hw.ui.saucedemo.ui.pages.LogInPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;

public class WebShopUiTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://www.saucedemo.com";
    }

    @Test
    public void userCanSuccessfullyPurchaseItems() {
        LogInPage registerAccountPage = new LogInPage();

        registerAccountPage.open();

        Account account = Account.builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();

        registerAccountPage.login(account);

        //Selenide.sleep(600_000); //10 minutes wait ot manually check UI


        // Products - page
        SelenideElement sauceLabsBackPackAddToCartButton =
                element(Selectors.byId("add-to-cart-sauce-labs-backpack"));
        sauceLabsBackPackAddToCartButton.click();

        SelenideElement sauceLabsBoltTshirt =
                element(Selectors.byId("add-to-cart-sauce-labs-bolt-t-shirt"));
        sauceLabsBoltTshirt.click();

        SelenideElement cartIcon = element(Selectors.byClassName("shopping_cart_link"));
        cartIcon.click();

        // Cart - page
        SelenideElement checkoutButton = element(Selectors.byId("checkout"));
        checkoutButton.click();

        // Checkout: Your Information - page
        SelenideElement firstNameInput = element(Selectors.byId("first-name"));
        firstNameInput.sendKeys("test-first-name");

        SelenideElement lastNameInput = element(Selectors.byId("last-name"));
        lastNameInput.sendKeys("test-last-name");

        SelenideElement zipPostalCodeInput = element(Selectors.byId("postal-code"));
        zipPostalCodeInput.sendKeys("test-zipcode");

        SelenideElement continueButton = element(Selectors.byId("continue"));
        continueButton.click();

        // Checkout: Overview - page
        SelenideElement finishButton = element(Selectors.byId("finish"));
        finishButton.click();

        // Checkout: Complete! - page
        element(Selectors.byId("checkout_complete_container"))
                .shouldHave(text("Thank you for your order!"));
    }
}
