package meet7.hw.booker.specs;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.utils.BookerUtils;

import java.util.List;

public class RequestSpec {
    private RequestSpecBuilder requestSpecBuilder;

    private static RequestSpecBuilder baseSpecBuilder() {

        return new RequestSpecBuilder()
                .addFilters(List.of(
                        new RequestLoggingFilter(),
                        new ResponseLoggingFilter(),
                        new AllureRestAssured()))
                //.setBaseUri("https://restful-booker.herokuapp.com")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON);
    }

    public static RequestSpecification baseSpec() {
        return baseSpecBuilder().build();
    }

    public static RequestSpecification tokenSpec() {
        return baseSpecBuilder()
                .addCookie("token", BookerUtils.generateToken()) // Add the token as a cookie
                .build();
    }
}
