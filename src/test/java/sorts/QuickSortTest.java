package sorts;

import org.junit.Test;

public class QuickSortTest {
    private QuickSort quickSort = new QuickSort();

    @Test
    public void shouldSortEmptyList() {
        int[] ints = {5, 4, 7, 2, 7, 3, 3 ,4,5,6,2,4,5,62,1,43,5,6,7,3,3,4,5,6,7,8,9,9};
        QuickSort.sort(ints,0, ints.length);
        for (int anInt : ints) {
            System.out.println(anInt);
        }

    }
}