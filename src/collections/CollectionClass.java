package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// List<E>, Set<E> extend Collection<E>
// Map<E> doesn't extend anything
// Map.entrySet, Collections
public class CollectionClass {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4,3,1,2); //varargs
        Collections.sort(integers);
        System.out.println(integers);
        System.out.println(Collections.min(integers));
        Collections.reverse(integers);

        Integer[] list = integers.toArray(new Integer[] {});
        System.out.println(" "+ list);

        Integer[] a  = {1,2,3,4};
        sum(1,2,4,5);
        integers = Arrays.asList(a);
    }

    public static int sum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        System.out.println(sum);
        return sum;
    }
}
