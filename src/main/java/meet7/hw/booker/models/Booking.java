package meet7.hw.booker.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Booking {
    @JsonProperty("bookingid")
    private String id;
    @JsonProperty("booking")
    private Booking booking;
    @JsonProperty("firstname")
    private String firstName;
    @JsonProperty("lastname")
    private String lastName;
    @JsonProperty("totalprice")
    private int totalPrice;
    @JsonProperty("depositpaid")
    private boolean isDepositPaid;
    @JsonProperty("bookingdates")
    @Builder.Default
    private BookingDate bookingDates = new BookingDate("", "");
    @JsonProperty("additionalneeds")
    private String additionalNeeds;
}