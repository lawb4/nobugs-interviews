package meet7.hw.booker.specs;

import io.qameta.allure.restassured.AllureRestAssured;
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
                .setBaseUri("https://restful-booker.herokuapp.com")
                .addFilters(List.of(
                        new RequestLoggingFilter(),
                        new ResponseLoggingFilter(),
                        new AllureRestAssured()))
                .setContentType(ContentType.JSON);
    }

    public static RequestSpecification noAuthSpec() {
        return baseSpecBuilder().build();
    }

    public static RequestSpecification tokenAuthSpec() {
        return baseSpecBuilder()
                .addCookie("token", BookerUtils.generateToken())
                .build();
    }

    public static RequestSpecification bearerAuthSpec() {
        return baseSpecBuilder()
                .addHeader("Authorization", "Basic YWRtaW46cGFzc3dvcmQxMjM=")
                .build();
    }
}
