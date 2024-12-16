package meet7.hw.booker.requests;

import java.util.Map;

public interface CrudInterface<T> {
    Object create(T entity);
    Object read(String id);
    Object update(String id, T entity);
    Object partiallyUpdate(String id, Map<String, Object> updateData);
    Object delete(String id);
}
