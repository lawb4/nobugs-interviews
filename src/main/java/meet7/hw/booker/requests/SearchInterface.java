package meet7.hw.booker.requests;

public interface SearchInterface<T> {
    Object readAll();

    Object readAllByFirstNameLastName(String firstname, String lastname);

    Object readAllByFirstName(String firstname);

    Object readAllByLastName(String lastname);

    Object readAllByCheckinCheckoutDates(String checkin, String checkout);

    Object readAllByCheckinDate(String checkin);

    Object readAllByCheckoutDate(String checkout);
}
