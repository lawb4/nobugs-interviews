package meet7.hw.ui.ultimate_qa.ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

import static com.codeborne.selenide.Selenide.element;

@Data
public class ProductsPage {
    private SelenideElement toggleButton =
            element(Selectors.byClassName("dropdown__toggle-button"));
}
