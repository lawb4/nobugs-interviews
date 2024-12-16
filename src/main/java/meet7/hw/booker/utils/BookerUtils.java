package meet7.hw.booker.utils;

import meet7.hw.booker.specs.RequestSpec;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class BookerUtils {

    public static String generateToken() {
        String credentials = """
                {
                    "username": "admin",
                    "password": "password123"
                }
                """;

        return given()
                .spec(RequestSpec.baseSpec())
                .body(credentials)
                .post("/auth")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .path("token");
    }
}
