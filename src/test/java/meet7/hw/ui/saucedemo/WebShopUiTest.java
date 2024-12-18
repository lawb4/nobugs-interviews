package meet7.hw.ui.saucedemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import meet7.hw.ui.saucedemo.ui.data.Account;
import meet7.hw.ui.saucedemo.ui.data.ProductsForCart;
import meet7.hw.ui.saucedemo.ui.pages.*;
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
        //Login page
        LogInPage registerAccountPage = new LogInPage();

        registerAccountPage.open();

        Account account = Account.builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();

        registerAccountPage.loginAction(account);

        // Products - page
        ProductsPage productsPage = new ProductsPage();
        ProductsForCart productsForCart = new ProductsForCart();

        productsPage.addToCart(productsForCart.getSauceLabsBackPackAddToCartButton());
        productsPage.addToCart(productsForCart.getSauceLabsBoltTshirAddToCartButton());

        productsPage.clickCartIcon();

        // Cart - page
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutButton();

        // Checkout: Your Information - page
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
        checkoutInformationPage.confirmInfoAndClickContinueButton();

        // Checkout: Overview - page
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutOverviewPage.clickFinishButton();

        // Checkout: Complete! - page
        /*element(Selectors.byId("checkout_complete_container"))
                .shouldHave(text("Thank you for your order!"));*/
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

        checkoutCompletePage.getCheckoutCompleteContainer().shouldHave(text("Thank you for your order!"));

        // Go back to Products page
        checkoutCompletePage.clickBackHomeButton();

        // Verify we are on Products page
        //class title = Products (should have )
        //Selenide.sleep(5000);
    }
}
