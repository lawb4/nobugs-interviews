package meet7.hw.booker.requests;

import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import meet7.hw.booker.models.Booking;
import org.apache.http.HttpStatus;

import java.util.List;
import java.util.Map;

public class ValidatedBookerRequest extends Request implements CrudInterface<Booking>, SearchInterface<Booking> {

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
        return bookerRequest.update(id, booking)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Override
    public ValidatableResponse partiallyUpdate(String id, Map<String, Object> updateData) {
        return bookerRequest.partiallyUpdate(id, updateData)
                .then()
                .statusCode(HttpStatus.SC_OK);
    }

    @Override
    public ValidatableResponse delete(String id) {
        return bookerRequest.delete(id)
                .then()
                .statusCode(HttpStatus.SC_CREATED);
    }

    @Override
    public List<Booking> readAll() {
        Booking[] bookings = bookerRequest.readAll()
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByFirstNameLastName(String firstname, String lastname) {
        Booking[] bookings = bookerRequest.readAllByFirstNameLastName(firstname, lastname)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByFirstName(String firstname) {
        Booking[] bookings = bookerRequest.readAllByFirstName(firstname)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByLastName(String lastname) {
        Booking[] bookings = bookerRequest.readAllByLastName(lastname)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByCheckinCheckoutDates(String checkin, String checkout) {
        Booking[] bookings = bookerRequest.readAllByCheckinCheckoutDates(checkin, checkout)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByCheckinDate(String checkin) {
        Booking[] bookings = bookerRequest.readAllByCheckinDate(checkin)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }

    @Override
    public List<Booking> readAllByCheckoutDate(String checkout) {
        Booking[] bookings = bookerRequest.readAllByCheckoutDate(checkout)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Booking[].class);
        return List.of(bookings);
    }
}

