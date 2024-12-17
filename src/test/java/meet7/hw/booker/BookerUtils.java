package meet7.hw.booker;

import meet7.hw.booker.models.Booking;
import meet7.hw.booker.models.BookingDate;

public class BookerUtils {

    public static Booking createBaseBookingObject() {
        return Booking.builder()
                .firstName("Viktor")
                .lastName("Manuel")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDates(BookingDate.builder()
                        .checkIn("2018-12-08")
                        .checkOut("2019-12-08").build())
                .additionalNeeds("Breakfast").build();
    }

    public static Booking createBaseBookingObjectWithCustomFirstName(String firstName) {
        return Booking.builder()
                .firstName(firstName)
                .lastName("Brown")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDates(BookingDate.builder()
                        .checkIn("2018-01-01")
                        .checkOut("2019-01-01").build())
                .additionalNeeds("Breakfast").build();
    }

    public static Booking createBaseBookingObjectWithCustomBookingDates(String checkIn, String checkOut) {
        return Booking.builder()
                .firstName("Viktor")
                .lastName("Manuel")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDates(BookingDate.builder()
                        .checkIn(checkIn)
                        .checkOut(checkOut).build())
                .additionalNeeds("Breakfast").build();
    }

    public static Booking createBaseBookingObjectWithCustomCheckInDate(String checkIn) {
        return Booking.builder()
                .firstName("Viktor")
                .lastName("Manuel")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDates(BookingDate.builder()
                        .checkIn(checkIn)
                        .checkOut("2019-01-01").build())
                .additionalNeeds("Breakfast").build();
    }

    public static Booking createBaseBookingObjectWithCustomCheckOutDate(String checkOut) {
        return Booking.builder()
                .firstName("Viktor")
                .lastName("Manuel")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDates(BookingDate.builder()
                        .checkIn("2018-01-01")
                        .checkOut(checkOut).build())
                .additionalNeeds("Breakfast").build();
    }
}
