package meet7.hw.ui.ultimate_qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import meet7.hw.ui.ultimate_qa.ui.data.Account;
import meet7.hw.ui.ultimate_qa.ui.pages.AllProductsPage;
import meet7.hw.ui.ultimate_qa.ui.pages.RegisterAccountPage;
import meet7.hw.ui.ultimate_qa.utils.Helpers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.element;

public class RegistrationPageUiTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://courses.ultimateqa.com";
    }

    @Test
    public void userCanCreateAccount() {
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();

        registerAccountPage.open();

        Account account = Account.builder()
                .firstName(Helpers.randomString())
                .lastName(Helpers.randomString())
                .email(Helpers.randomString() + "@gmail.com")
                .password(Helpers.randomString())
                .build();

        registerAccountPage.register(account);

        AllProductsPage allProductsPage = new AllProductsPage();
        SelenideElement toggleButton = element(Selectors.byClassName("dropdown__toggle-button"));
        toggleButton.shouldHave(text(account.getFirstName()));
    }
}
