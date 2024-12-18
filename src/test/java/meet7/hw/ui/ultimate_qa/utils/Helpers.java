package meet7.hw.ui.ultimate_qa.utils;

import com.codeborne.selenide.SelenideElement;

public class Helpers {
    public static void setInputIfNotNull(SelenideElement inputElement, String value) {
        if (value != null) {
            inputElement.sendKeys(value);
        }
    }
}
