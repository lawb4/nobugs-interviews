package meet7.hw.ui.ultimate_qa.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import meet7.hw.ui.ultimate_qa.ui.data.Account;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selenide.$;
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
    //private SelenideElement captchaCheckbox = element(Selectors.byAttribute("type", "checkbox"));

    // Buttons
    private SelenideElement registerButton =
            element(Selectors.byAttribute("type", "submit"));

    // Methods
    public void open() {
        Selenide.open("/users/sign_up");
        //Selenide.sleep(5000);
        //$("input[type='checkbox']").click();
        //element(Selectors.byAttribute("input", "checkbox")).click();

//        SelenideElement waiter = $("input").shouldHave(
//                Condition.attribute("type", "checkbox"));
//
//        waiter.click();
        //$("input[type='checkbox']").shouldBe(Condition.visible).click();
        //$("input[type='checkbox']").should(exist).click();
        //Selenide.sleep(5000);
        //captchaCheckbox.click();

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
