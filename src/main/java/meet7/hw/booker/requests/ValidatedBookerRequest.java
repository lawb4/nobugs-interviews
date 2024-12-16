package meet7.hw.booker.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.models.Booking;
import org.apache.http.HttpStatus;

public class ValidatedBookerRequest extends Request implements CrudInterface<Booking> {

    private BookerRequest bookerRequest;

    public ValidatedBookerRequest(RequestSpecification reqSpec) {
        super(reqSpec);
        bookerRequest = new BookerRequest(reqSpec);
    }

    @Override
    public ValidatableResponse create(Booking booking) {
        return bookerRequest.create(booking)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Override
    public ValidatableResponse read(String id) {
        return bookerRequest.read(id)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Override
    public ValidatableResponse update(String id, Booking booking) {
        return null;
    }

    @Override
    public ValidatableResponse delete(String id) {
        return bookerRequest.delete(id)
                .then()
                .statusCode(HttpStatus.SC_CREATED);
        //.log().all();
    }
}

