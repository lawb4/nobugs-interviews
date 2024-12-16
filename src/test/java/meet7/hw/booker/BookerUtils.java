package meet7.hw.booker;

import meet7.hw.booker.models.Booking;
import meet7.hw.booker.models.BookingDate;

public class BookerUtils {

    public static Booking createBaseBookingObject() {
        return Booking.builder()
                .firstName("Jim")
                .lastName("Brown")
                .totalPrice(111)
                .isDepositPaid(true)
                .bookingDate(BookingDate.builder()
                        .checkin("2018-01-01")
                        .checkout("2019-01-01").build())
                .additionalNeeds("Breakfast").build();
    }
}
