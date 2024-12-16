package meet7.hw.booker.requests;

public interface CrudInterface<T> {
    Object create(T entity);
    Object read(String id);
    Object update(String id, T entity);
    Object delete(String id);
}
