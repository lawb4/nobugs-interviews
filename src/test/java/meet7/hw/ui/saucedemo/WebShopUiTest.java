package meet7.hw.ui.saucedemo;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import meet7.hw.ui.saucedemo.ui.data.Account;
import meet7.hw.ui.saucedemo.ui.pages.LogInPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WebShopUiTest {

    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://www.saucedemo.com";
    }

    @Test
    public void userCanCreateAccount() {
        LogInPage registerAccountPage = new LogInPage();

        registerAccountPage.open();

        Account account = Account.builder()
                .username("standard_user")
                .password("secret_sauce")
                .build();

        registerAccountPage.login(account);

        Selenide.sleep(600_000); //10 minutes wait ot manually check UI
    }
}
