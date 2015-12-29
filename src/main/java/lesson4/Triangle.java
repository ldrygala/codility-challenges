package lesson4;

import java.util.Arrays;

/**
 * Created by ldrygala on 2015-12-29.
 */
public class Triangle {

    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 2; i < A.length; i++) {
            if (isTriangle(A[i - 2], A[i - 1], A[i])) {
                return 1;
            }
        }
        return 0;
    }

    private boolean isTriangle(int a, int b, int c) {
        return a + b > c && b + c > a && a + c > b;
    }
}
