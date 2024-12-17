package meet7.hw.booker.requests;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.models.Booking;

import java.io.File;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BookerRequest extends Request implements CrudInterface<Booking>, SearchInterface<Booking> {

    private final String BOOKING_ENDPOINT = "/booking";

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
                .get(BOOKING_ENDPOINT + File.separator + id);
    }

    @Override
    public Response update(String id, Booking booking) {
        return given()
                .spec(reqSpec)
                .body(booking)
                .put(BOOKING_ENDPOINT + File.separator + id);
    }

    @Override
    public Response partiallyUpdate(String id, Map<String, Object> updateData) {
        return given()
                .spec(reqSpec)
                .body(updateData)
                .patch(BOOKING_ENDPOINT + File.separator + id);
    }

    @Override
    public Response delete(String id) {
        return given()
                .spec(reqSpec)
                //.cookie("token", BookerUtils.generateToken())
                .delete(BOOKING_ENDPOINT + File.separator + id);
    }

    @Override
    public Response readAll() {
        return given()
                .spec(reqSpec)
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByFirstNameLastName(String firstname, String lastname) {
        return given()
                .spec(reqSpec)
                .queryParam("firstname", firstname)
                .queryParam("lastname", lastname)
                .when()
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByFirstName(String firstname) {
        return given()
                .spec(reqSpec)
                .queryParam("firstname", firstname)
                .when()
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByLastName(String lastname) {
        return given()
                .spec(reqSpec)
                .queryParam("lastname", lastname)
                .when()
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByCheckinCheckoutDates(String checkin, String checkout) {
        return given()
                .spec(reqSpec)
                .queryParam("checkin", checkin)
                .queryParam("checkout", checkout)
                .when()
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByCheckinDate(String checkin) {
        return given()
                .spec(reqSpec)
                .queryParam("checkin", checkin)
                .when()
                .get(BOOKING_ENDPOINT);
    }

    @Override
    public Response readAllByCheckoutDate(String checkout) {
        return given()
                .spec(reqSpec)
                .queryParam("checkout", checkout)
                .when()
                .get(BOOKING_ENDPOINT);
    }
}
