package meet7.hw.booker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import meet7.hw.booker.models.Booking;
import meet7.hw.booker.requests.BookerRequest;
import meet7.hw.booker.requests.ValidatedBookerRequest;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BookerTest {

    private final BookerRequest bookerRequest = new BookerRequest();
    private final ValidatedBookerRequest validatedBookerRequest = new ValidatedBookerRequest();

    @BeforeAll
    public static void setupTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .build();
    }

    @Test
    public void userCanCreateBooking() {
        Booking booking = BookerUtils.createBaseBookingObject();
        bookerRequest.create(booking);

        //bookerRequest.read()
    }

    @Test
    public void userCanGetBooking() {
        // Каждые 10 мин эндпоинт сбрасывается, поэтому айдишники могут меняться
        // поэтому надо создавать снова Букинг, чтобы потом можно было его Гетать
        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = validatedBookerRequest.create(booking);

        validatedBookerRequest.read(b1.getId());
        //bookerRequest.read("3620");
    }

    @Test
    public void userCanDeleteBooking() {
        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = validatedBookerRequest.create(booking);

        //TODO нужно запилить токен авторизации и потом его как-то прокидывать
        //https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken
        validatedBookerRequest.delete(b1.getId());
    }
}
