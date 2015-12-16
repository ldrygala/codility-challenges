package sorts;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QuickSort2Test {
    private QuickSort quickSort = new QuickSort();

    @Test
    public void shouldSortEmptyList() {
        List<Integer> sort = QuickSort2.sort(new LinkedList<Integer>(Arrays.asList(5, 4, 7, 2, 7, 3, 3, 4, 5, 6, 2, 4, 5, 62, 1, 43, 5, 6, 7, 3, 3, 4, 5, 6, 7, 8, 9, 9)));
        for (int i : sort) {
            System.out.println(i);
        }

    }
}