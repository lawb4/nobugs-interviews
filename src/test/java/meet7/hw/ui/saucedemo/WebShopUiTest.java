package meet7.hw.ui.saucedemo;

import com.codeborne.selenide.Configuration;
import meet7.hw.ui.saucedemo.ui.data.Account;
import meet7.hw.ui.saucedemo.ui.data.ProductsForCart;
import meet7.hw.ui.saucedemo.ui.pages.*;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

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

        Account account = new Account();
        account.setStandardUser();

        registerAccountPage.clickLoginButton(account);

        // Page: "Products"
        ProductsPage productsPage = new ProductsPage();
        ProductsForCart productsForCart = new ProductsForCart();

        productsPage.addToCart(productsForCart.getSauceLabsBackPackAddToCartButton());
        productsPage.addToCart(productsForCart.getSauceLabsBoltTshirAddToCartButton());

        productsPage.clickCartIcon();

        // Page: "Cart"
        CartPage cartPage = new CartPage();
        cartPage.clickCheckoutButton();

        // Page: "Checkout: Your Information"
        CheckoutInformationPage checkoutInformationPage = new CheckoutInformationPage();
        checkoutInformationPage.confirmInfoAndClickContinueButton();

        // Page: "Checkout: Overview"
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage();
        checkoutOverviewPage.clickFinishButton();

        // Page: "Checkout: Complete!"
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();
        checkoutCompletePage.getCheckoutCompleteContainer().shouldHave(text("Thank you for your order!"));

        // Page: "Go back to Products page"
        checkoutCompletePage.clickBackHomeButton();
        productsPage.getProductsTitle().shouldHave(text("Products"));
    }
}
