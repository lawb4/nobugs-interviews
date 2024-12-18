package meet7.hw.ui.ultimate_qa.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.element;

public class AllProductsPage {

    // Headings
    private SelenideElement rightPanelWithWelcomeUsernameHeading =
            element(Selectors.byCssSelector("#rightPanel h1.title"));

    // Onscreen Text
    private SelenideElement rightPanelWithWelcomeSuccessfulAccountCreationText =
            element(Selectors.byCssSelector("#rightPanel p"));
}
