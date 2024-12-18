package meet7.hw.ui.ultimate_qa.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import meet7.hw.ui.ultimate_qa.ui.data.Account;

import static com.codeborne.selenide.Selenide.element;
import static meet7.hw.ui.ultimate_qa.utils.Helpers.setInputIfNotNull;

@Getter
public class RegisterAccountPage {
    // Inputs
    private SelenideElement firstNameInput = element(Selectors.byId("user[first_name]"));

    private SelenideElement lastNameInput = element(Selectors.byId("user[last_name]"));

    private SelenideElement emailInput = element(Selectors.byId("user[email]"));

    private SelenideElement passwordInput = element(Selectors.byId("user[password]"));

    // Checkboxes
    private SelenideElement acceptTermsCheckbox = element(Selectors.byId("user[terms]"));

    // Buttons
    private SelenideElement registerButton =
            element(Selectors.byAttribute("type", "submit"));

    // Methods
    public void open() {
        Selenide.open("/users/sign_up");
    }

    public void register(Account account) {
        setInputIfNotNull(firstNameInput, account.getFirstName());
        setInputIfNotNull(lastNameInput, account.getLastName());
        setInputIfNotNull(emailInput, account.getEmail());
        setInputIfNotNull(passwordInput, account.getPassword());
        acceptTermsCheckbox.click();

        registerButton.click();
    }
}
