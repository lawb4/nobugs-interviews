package meet7.hw.booker;

import io.restassured.response.Response;
import meet7.hw.booker.models.Booking;
import meet7.hw.booker.models.BookingDate;

import static io.restassured.RestAssured.given;

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

    public static Booking testPostExtractBooking(Booking booking) {
        return given()
                .body(booking)
                .when()
                .post("/booking/")
                .then()
                .extract()
                .as(Booking.class);
    }
}
