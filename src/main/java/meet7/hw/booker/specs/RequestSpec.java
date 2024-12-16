package meet7.hw.booker.specs;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

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

    //    public static RequestSpecification authSpec() {
//        return baseSpecBuilder()
//                .setBody("""
//                        {
//                            "username": "admin",
//                            "password": "password123"
//                        }
//                        """)
//                .build();
//    }
    public static RequestSpecification authSpec() {
        PreemptiveBasicAuthScheme authScheme = new PreemptiveBasicAuthScheme();
        authScheme.setUserName("admin");
        authScheme.setPassword("admin");

        return baseSpecBuilder().setAuth(authScheme).build();
    }

    public static RequestSpecification tokenSpec(String token) {
        return baseSpecBuilder()
                .addCookie("token", token) // Add the token as a cookie
                .build();
    }
}
