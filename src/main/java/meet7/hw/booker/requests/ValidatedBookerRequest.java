package meet7.hw.booker.requests;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import meet7.hw.booker.models.Booking;
import org.apache.http.HttpStatus;

public class ValidatedBookerRequest implements CrudInterface<Booking> {

    private BookerRequest bookerRequest;

    public ValidatedBookerRequest() {
        bookerRequest = new BookerRequest();
    }

    @Override
    public Booking create(Booking booking) {
        return new BookerRequest().create(booking)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking.class);
    }

    @Override
    public Booking read(String id) {
        return new BookerRequest().read(id)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking.class);
    }

    @Override
    public Response update(String id, Booking booking) {
        return null;
    }

    @Override
    public ValidatableResponse delete(String id) {
        return new BookerRequest().delete(id)
                .then()
                .statusCode(HttpStatus.SC_FORBIDDEN);
    }
}

