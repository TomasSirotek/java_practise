package generics;

import java.util.List;
import java.util.Optional;

public class SpecificObject implements GenericObject{
    @Override
    public List getElementS() {
        return null;
    }

    @Override
    public void createElement(Object element, Object element2) {

    }

    @Override
    public boolean deleteElement(Object elementId) {
        return false;
    }

    @Override
    public Optional getElementById(Object id) {
        return Optional.empty();
    }
}
