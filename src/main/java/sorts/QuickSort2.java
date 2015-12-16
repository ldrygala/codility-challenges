package sorts;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ldrygala on 2015-12-11.
 */
public class QuickSort2 {

    public static <E extends Comparable<E>> List<E> sort(LinkedList<E> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            E pivot = list.removeLast();
            LinkedList<E> lessOrEq = list.stream().filter(e -> e.compareTo(pivot) <= 0).collect(Collectors.toCollection(LinkedList::new));
            LinkedList<E> greater = list.stream().filter(e -> e.compareTo(pivot) > 0).collect(Collectors.toCollection(LinkedList::new));
            List<E> left = sort(lessOrEq);
            List<E> right = sort(greater);
            List<E> result = new LinkedList<>(left);
            result.add(pivot);
            result.addAll(right);
            return result;
        }
    }

}
