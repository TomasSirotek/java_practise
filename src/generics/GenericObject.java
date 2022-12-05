package generics;

import java.util.List;
import java.util.Optional;

public interface GenericObject<T,V> {
    List<T> getElementS();
    void createElement(T element,V element2);
    boolean deleteElement(T elementId);

    Optional<T> getElementById(T id);
}
