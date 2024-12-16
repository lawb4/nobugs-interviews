package meet7.hw.booker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.models.Booking;
import meet7.hw.booker.requests.BookerRequest;
import meet7.hw.booker.requests.ValidatedBookerRequest;
import meet7.hw.booker.specs.RequestSpec;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class BookerTest {

    //private static BookerRequest authReq;
    private static ValidatedBookerRequest valAuthReq;
    private static String authToken;
    //private static RequestSpecification requestSpecification;

    @BeforeAll
    public static void setupTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
        RestAssured.requestSpecification = RequestSpec.authSpec();


//        RequestSpecification tokenSpec = new RequestSpecBuilder()
//                .addRequestSpecification(RequestSpec.authSpec()) // Base spec from your class
//                //.addCookie("token", authToken) // Add the token as a cookie for authorization
//                .build();

        //authToken = BookerUtils.getToken();
        //authReq = new BookerRequest(RequestSpec.authSpec());
        //valAuthReq = new ValidatedBookerRequest(RequestSpec.authSpec());

        // Step 1: Generate the authentication token
        //authToken = BookerUtils.generateToken(); // BookerUtils calls RequestSpec.authSpec() internally

        // Step 2: Set the default RestAssured request specification with the token
        //RequestSpec.tokenSpec(BookerUtils.generateToken());
        //valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenSpec(BookerUtils.generateToken()));
    }

    @BeforeAll
    public static void setupTests() {
        //RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        //RestAssured.baseURI = "https://restful-booker.herokuapp.com";
//        RestAssured.requestSpecification = new RequestSpecBuilder()
//                .setContentType(ContentType.JSON)
//                .build();
        RestAssured.requestSpecification = RequestSpec.authSpec();

        //authToken = BookerUtils.getToken();
        authReq = new BookerRequest(RequestSpec.authSpec());
        valAuthReq = new ValidatedBookerRequest(RequestSpec.authSpec());
    }


    @Test
    public void userCanCreateBooking() {
        ValidatedBookerRequest valAuthReq1 = new ValidatedBookerRequest(RequestSpec.authSpec());

        Booking booking = BookerUtils.createBaseBookingObject();
        valAuthReq1.create(booking);

        //bookerRequest.read()
    }

    @Test
    public void userCanGetBooking() {
        // Каждые 10 мин эндпоинт сбрасывается, поэтому айдишники могут меняться
        // поэтому надо создавать снова Букинг, чтобы потом можно было его Гетать
        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = valAuthReq.create(booking).extract().as(Booking.class);

        valAuthReq.read(b1.getId());
        //bookerRequest.read("3620");
    }

    @Test
    public void userCanDeleteBooking() {
        //ValidatedBookerRequest valAuthReq1 = new ValidatedBookerRequest(RequestSpec.tokenSpec(authToken));


        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = valAuthReq.create(booking).extract().as(Booking.class);

        //TODO нужно запилить токен авторизации и потом его как-то прокидывать
        //https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken
        valAuthReq.delete(b1.getId());
    }

    @Test
    public void checkTest() {
        Response response = given()
                .spec(RequestSpec.tokenSpec(authToken)) // Custom RequestSpecification
                .when()
                .get("/booking");

        System.out.println("Response Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());

    }

    @Test
    public void testCreateAndDeleteBooking() {
        // Create a new booking
        String payload = """
    {
        "firstname": "John",
        "lastname": "Doe",
        "totalprice": 150,
        "depositpaid": true,
        "bookingdates": {
            "checkin": "2024-12-20",
            "checkout": "2024-12-25"
        },
        "additionalneeds": "Breakfast"
    }
    """;

        int bookingId = given()
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/booking")
                .then()
                .statusCode(200)
                .extract()
                .path("bookingid");

        // Delete the booking
        given()
                .auth()
                .basic("admin", "password123")
                .delete("/booking/" + bookingId)
                .then()
                .statusCode(201); // Verify success
    }

}
