package lesson1;

import java.math.BigInteger;

/**
 * Created by ldrygala on 2015-12-05.
 */
public class PermMissingElem {
    public int solution(int[] A) {
        BigInteger sum = BigInteger.valueOf(2 + A.length).multiply(BigInteger.valueOf(A.length + 1)).divide(BigInteger.valueOf(2));
        for (int i : A) {
            sum = sum.subtract(BigInteger.valueOf(i));
        }
        return sum.intValue();
    }
}
