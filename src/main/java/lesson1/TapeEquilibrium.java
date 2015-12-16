package lesson1;

/**
 * Created by ldrygala on 2015-12-04.
 */
public class TapeEquilibrium {
    public int solution(int[] A) {
        int right = 0;
        for (int i : A) {
            right+=i;
        }

        int min = Integer.MAX_VALUE;
        int left = 0;

        for (int i = 1; i < A.length; i++) {
            left += A[i-1];
            right -= A[i-1];
            int abs = Math.abs(left - right);
            if(min > abs) {
                min = abs;
            }
        }
        return min;
    }
}
