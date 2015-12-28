package lesson4;

import java.util.Arrays;

/**
 * Created by ldrygala on 2015-12-28.
 */
public class MaxProductOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int resultPositive = 1;

        for(int i = 1; i < 4; i++) {
            resultPositive *= A[A.length-i];
        }

        int resultNegative = A[0]*A[1]*A[A.length-1];

        return Math.max(resultPositive,resultNegative);
    }
}
