import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CountList3<E> extends ArrayList<E> {
    int count  = 0;
    @Override
    public boolean add(E e) {
        count++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        count = count + c.size();
        return super.addAll(c);
    }

    public static void main(String[] args) {
        CountList3<Integer> countList = new CountList3<>();
        countList.add(1);
        countList.add(2);
        countList.addAll(Arrays.asList(1, 5));
        System.out.println(countList.count);
    }
}
