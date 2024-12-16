package meet7.hw.booker.requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.utils.BookerUtils;
import meet7.hw.booker.models.Booking;

import static io.restassured.RestAssured.given;

public class BookerRequest extends Request implements CrudInterface<Booking> {

    private final String BOOKING_ENDPOINT = "/booking/";

    public BookerRequest(RequestSpecification reqSpec) {
        super(reqSpec);
    }

    @Override
    public Response create(Booking booking) {
        return given()
                .spec(reqSpec)
                .body(booking)
                .when()
                .post(BOOKING_ENDPOINT);
    }

    @Override
    public Response read(String id) {
        return given()
                .spec(reqSpec)
                .get(BOOKING_ENDPOINT + id);
    }

    @Override
    public Response update(String id, Booking booking) {
        return null;
    }

    @Override
    public Response delete(String id) {
        return given()
                .spec(reqSpec)
                //.cookie("token", BookerUtils.generateToken())
                .delete(BOOKING_ENDPOINT + id);
    }
}
