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

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAll();

        Assertions.assertFalse(bookings.isEmpty());

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
    public void userCanGetAllBookingsFilterByFirstNameAndLastName() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByFirstNameLastName("Viktor", "Manuel");

        Assertions.assertFalse(bookings.isEmpty());

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

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByFirstName("Viktor");

        Assertions.assertFalse(bookings.isEmpty());

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

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByLastName("Manuel");

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
    // I have no idea why this autotest always fails
    public void userCanGetAllBookingsFilterByCheckinAndCheckoutDates() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectWithCustomBookingDates(
                "2023-01-02",
                "2023-12-12"
        );
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByCheckinCheckoutDates(
                "2023-01-01",
                "2024-01-01");

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
    // I have no idea why this autotest always fails
    public void userCanGetAllBookingsFilterByCheckinDate() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectWithCustomCheckInDate("2023-01-02");
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByCheckinDate("2023-01-01");

        Assertions.assertFalse(bookings.isEmpty());

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
    public void userCanGetAllBookingsFilterByCheckoutDate() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectWithCustomCheckOutDate("2024-01-01");
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAllByCheckoutDate("2024-01-01");

        Assertions.assertFalse(bookings.isEmpty());

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
    public void userCanGetBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        Booking retrievedBooking = valAuthReq.read(booking.getId()).extract().as(Booking.class);

        Assertions.assertEquals(bookingObject.getFirstName(), retrievedBooking.getFirstName()
                , "Firstnames differ");
        Assertions.assertEquals(bookingObject.getLastName(), retrievedBooking.getLastName()
                , "Lastnames differ");
    }

    @Test
    public void userCanCreateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.noAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAll();

        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                Assertions.assertEquals(b.getFirstName(), booking.getFirstName());
                Assertions.assertEquals(b.getLastName(), booking.getLastName());
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanUpdateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        Booking updatedBookingObject = BookerUtils.createBaseBookingObjectV2();
        Booking updatedBooking = valAuthReq.update(booking.getId(), updatedBookingObject).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAll();

        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                Assertions.assertEquals(updatedBookingObject, updatedBooking);
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanPartiallyUpdateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        Map<String, Object> updateData = new HashMap<>();
        updateData.put("firstname", "Andrew");
        updateData.put("lastname", "Garfield");
        updateData.put("totalprice", 1200);

        Booking partiallyUpdatedBooking =
                valAuthReq.partiallyUpdate(booking.getId(), updateData).extract().as(Booking.class);

        List<Booking> bookings = valAuthReq.readAll();

        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                Assertions.assertEquals("Andrew", partiallyUpdatedBooking.getFirstName());
                Assertions.assertEquals("Garfield", partiallyUpdatedBooking.getLastName());
                Assertions.assertEquals(1200, partiallyUpdatedBooking.getTotalPrice());
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertTrue(isContainsExpectedBooking, "Expected booking was not found");
    }

    @Test
    public void userCanDeleteBookingWithCookieToken() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        valAuthReq.delete(booking.getId());

        List<Booking> bookings = valAuthReq.readAll();

        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertFalse(isContainsExpectedBooking, "Booking is still in the list");
    }

    @Test
    public void userCanDeleteBookingWithBearerToken() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.bearerAuthSpec());

        Booking bookingObject = BookerUtils.createBaseBookingObjectV1();
        Booking booking = valAuthReq.create(bookingObject).extract().as(Booking.class);

        valAuthReq.delete(booking.getId());

        List<Booking> bookings = valAuthReq.readAll();

        boolean isContainsExpectedBooking = false;
        for (Booking b : bookings) {
            if (b.getId().equals(booking.getId())) {
                isContainsExpectedBooking = true;
                break;
            }
        }
        Assertions.assertFalse(isContainsExpectedBooking, "Booking is still in the list");
    }
}
