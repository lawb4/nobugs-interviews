package meet7.hw.ui.saucedemo.ui.pages;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import meet7.hw.ui.saucedemo.ui.data.Account;

import static com.codeborne.selenide.Selenide.element;
import static meet7.hw.ui.saucedemo.utils.Helpers.setInputIfNotNull;

@Getter
public class LogInPage {
    // Inputs
    private final SelenideElement usernameInput = element(Selectors.byId("user-name"));

    private final SelenideElement passwordInput = element(Selectors.byId("password"));

    // Buttons
    private final SelenideElement loginButton = element(Selectors.byId("login-button"));

    // Methods
    public void open() {
        Selenide.open(Configuration.baseUrl);
    }

    public void loginAction(Account account) {
        setInputIfNotNull(usernameInput, account.getUsername());
        setInputIfNotNull(passwordInput, account.getPassword());

        loginButton.click();
    }
}
