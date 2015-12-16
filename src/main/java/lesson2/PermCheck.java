package lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class PermCheck {
    public int solution(int[] A) {
        int result = 1;
        int length = A.length;
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            int number = A[i];

            if(number > length || number < 1 || !numbers.add(number)) {
                result = 0;
                break;
            }
        }
        return result;
    }
}
