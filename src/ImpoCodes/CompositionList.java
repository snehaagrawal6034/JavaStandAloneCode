package ImpoCodes;

import java.util.ArrayList;
import java.util.Collection;

public class CompositionList<E> extends ArrayList<E> {
    private final ArrayList<E> arrayList = new ArrayList<>();
    int count = 0;
    @Override
    public boolean add(E e) {
        count++;
        return arrayList.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count = count + c.size();
        return arrayList.addAll(c);
    }
}
