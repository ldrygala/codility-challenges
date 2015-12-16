package sorts;

/**
 * Created by ldrygala on 2015-12-10.
 */
public class QuickSort {
    public static void sort(int[] list, int from, int to) {
        int i = from;
        int c = from;
        if (to - from <= 1) {
            return;
        }
        int pivotIndex = to - 1;
        int pivot = list[pivotIndex];
        while (c < pivotIndex) {
            int current = list[c];
            if (current <= pivot) {
                swap(list, c, i);
                i++;
            }
            c++;
        }
        swap(list, pivotIndex, i);
        sort(list, from, i);
        sort(list, i + 1, to);
    }

    private static void swap(int[] list, int x, int y) {
        int tmp = list[x];
        list[x] = list[y];
        list[y] = tmp;
    }
}
