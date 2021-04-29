import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CountList<E> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for (E e : c) {
            add(e);
        }
        return true;
    }
}
