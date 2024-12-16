package meet7.hw.booker.requests;

import io.restassured.response.Response;
import meet7.hw.booker.models.Booking;

import static io.restassured.RestAssured.given;

public class BookerRequest implements CrudInterface<Booking> {

    //private final String BASE_URL = "https://restful-booker.herokuapp.com";
    private final String BOOKING_ENDPOINT = "/booking/";

    @Override
    public Response create(Booking booking) {
        return given()
                .body(booking)
                .when()
                .post(BOOKING_ENDPOINT);
    }

    @Override
    public Response read(String id) {
        return given()
                .get(BOOKING_ENDPOINT + id);
    }

    @Override
    public Response update(String id, Booking booking) {
        return null;
    }

    @Override
    public Response delete(String id) {
        return given()
                .delete(BOOKING_ENDPOINT + id);
    }
}
