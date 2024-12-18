package meet7.hw.ui.ultimate_qa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import meet7.hw.ui.ultimate_qa.ui.data.Account;
import meet7.hw.ui.ultimate_qa.ui.pages.RegisterAccountPage;
import meet7.hw.ui.ultimate_qa.utils.RandomData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.element;

public class RegistrationPageUiTest {

    @BeforeAll
    public static void setupUiTests() {
        //Configuration.browser = "safari";

        //Configuration.pageLoadStrategy ="eager";
        //System.setProperty("selenide.pageLoadStrategy", "eager");


        Configuration.baseUrl = "https://courses.ultimateqa.com";
    }

    @Test
    public void userCanCreateAccount() {

        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        //SuccessfulRegistrationPage successfulRegistrationPage = new SuccessfulRegistrationPage();

        registerAccountPage.open();
        //Selenide.sleep(600_000); //10minutes

        Account account = Account.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .email(RandomData.randomString() + "@gmail.com")
                .password(RandomData.randomString())
                .build();

        registerAccountPage.register(account);

        //Selenide.sleep(600_000); //10minutes подождать, чтобы чекнуть регистрацию

        //
//        SelenideElement menuWithUsername =
//                element(Selectors.byClassName("button.dropdown__toggle-button"));
//
//        menuWithUsername.shouldBe(visible);
//        menuWithUsername.shouldHave(Condition.text(username));
        //$(".button.dropdown__toggle-button#text").shouldHave(text(account.getFirstName()));

        // Define SelenideElement for the button with class "button dropdown__toggle-button"
        SelenideElement toggleButton = element(Selectors.byClassName(".button.dropdown__toggle-button"));

        toggleButton.$("#text").shouldHave(text(account.getFirstName()));

        //$("h1").shouldBe(visible)

//        successfulRegistrationPage.getRightPanelWithWelcomeUsernameHeading()
//                .shouldHave(Condition.text(String.format("Welcome %s", Account.getUsername())));
//        successfulRegistrationPage.getRightPanelWithWelcomeSuccessfulAccountCreationText()
//                .shouldHave(Condition.text("Your account was created successfully. You are now logged in"));
    }
}
