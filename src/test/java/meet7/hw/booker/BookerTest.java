package meet7.hw.booker;

import meet7.hw.booker.models.Booking;
import meet7.hw.booker.requests.ValidatedBookerRequest;
import meet7.hw.booker.specs.RequestSpec;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookerTest {

    @Test
    public void userCanGetAllBookings() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAll();

        //Assertions.assertTrue(bookings.contains(booking));
        //Assertions.assertFalse(bookings.isEmpty());
    }

    @Test
    public void userCanGetAllBookingsFilterByFirstNameAndLastName() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByFirstNameLastName("Viktor", "Manuel");

        // Assert List is not empty
        Assertions.assertFalse(bookings.isEmpty());

        // Assert the response contains the expected booking
        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanGetAllBookingsFilterByFirstName() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByFirstName("Viktor");

        // Assert the response contains the expected booking
        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanGetAllBookingsFilterByLastName() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByLastName("Manuel");

        // Assert the response contains the expected booking
        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanGetAllBookingsFilterByCheckinAndCheckoutDates() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByCheckinCheckoutDates(
                "2018-01-01",
                "2019-01-01");

        // Assert the response contains the expected booking
        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getBookingDates().getCheckIn().equals(booking.getBookingDates().getCheckIn())
                    && b.getBookingDates().getCheckOut().equals(booking.getBookingDates().getCheckOut())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }


    @Test
    public void userCanGetBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        valAuthReq.read(booking.getId());
    }

    @Test
    public void userCanCreateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking booking = BookerUtils.createBaseBookingObject();
        valAuthReq.create(booking);
    }

    @Test
    public void userCanUpdateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        Booking updatedBookingObject = BookerUtils.createBaseBookingObjectWithCustomFirstName("Andrew");

        valAuthReq.update(booking.getId(), updatedBookingObject);
    }

    @Test
    public void userCanPartiallyUpdateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        Map<String, Object> updateData = new HashMap<>();
        updateData.put("firstname", "Andrew");
        updateData.put("lastname", "Garfield");
        updateData.put("totalprice", 1200);

        valAuthReq.partiallyUpdate(booking.getId(), updateData);
    }

    @Test
    public void userCanDeleteBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObject();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        valAuthReq.delete(booking.getId());
    }
}
