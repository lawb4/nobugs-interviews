package meet7.hw.ui.ultimate_qa;

import com.codeborne.selenide.Configuration;
import meet7.hw.ui.ultimate_qa.ui.data.Account;
import meet7.hw.ui.ultimate_qa.ui.pages.ProductsPage;
import meet7.hw.ui.ultimate_qa.ui.pages.RegisterAccountPage;
import meet7.hw.ui.ultimate_qa.utils.RandomData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class RegistrationPageUiTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://courses.ultimateqa.com";
    }

    @Test
    public void userCanSuccessfullyCreateAccount() {
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();

        registerAccountPage.open();

        Account account = Account.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .email(RandomData.randomString() + "@gmail.com")
                .password(RandomData.randomString())
                .build();

        registerAccountPage.register(account);

        ProductsPage productsPage = new ProductsPage();
        // Verify user is successfully registered and is located on "Products" page
        productsPage.getToggleButton().shouldHave(text(account.getFirstName()));
    }
}
