package meet7.hw.ui.saucedemo.utils;

import com.codeborne.selenide.SelenideElement;
import org.apache.commons.lang3.RandomStringUtils;

public class Helpers {
    public static void setInputIfNotNull(SelenideElement inputElement, String value) {
        if (value != null) {
            inputElement.sendKeys(value);
        }
    }

    public static String randomString() {
        return "test_" + RandomStringUtils.randomAlphabetic(10);
    }
}
