package meet7.hw.booker;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import meet7.hw.booker.models.Booking;
import meet7.hw.booker.requests.ValidatedBookerRequest;
import meet7.hw.booker.specs.RequestSpec;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BookerTest {

    @BeforeAll
    public static void setupTests() {
        //RestAssured.baseURI = "https://restful-booker.herokuapp.com";
//        RestAssured.requestSpecification = new RequestSpecBuilder()
//                .setContentType(ContentType.JSON)
//                .build();
        //RestAssured.requestSpecification = RequestSpec.baseSpec();
    }

    @Test
    public void userCanCreateBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.baseSpec());

        Booking booking = BookerUtils.createBaseBookingObject();
        valAuthReq.create(booking);

        //bookerRequest.read()
    }

    @Test
    public void userCanGetBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.baseSpec());
        // Каждые 10 мин эндпоинт сбрасывается, поэтому айдишники могут меняться
        // поэтому надо создавать снова Букинг, чтобы потом можно было его Гетать
        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = valAuthReq.create(booking).extract().as(Booking.class);

        valAuthReq.read(b1.getId());
    }

    @Test
    public void userCanDeleteBooking() {
        ValidatedBookerRequest valAuthReq = new ValidatedBookerRequest(RequestSpec.tokenSpec());


        Booking booking = BookerUtils.createBaseBookingObject();
        Booking b1 = valAuthReq.create(booking).extract().as(Booking.class);

        //TODO нужно запилить токен авторизации и потом его как-то прокидывать
        //https://restful-booker.herokuapp.com/apidoc/index.html#api-Auth-CreateToken
        valAuthReq.delete(b1.getId());
    }
}
