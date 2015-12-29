package lesson4;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ldrygala on 2015-12-29.
 */
public class Distinct {
    public int solution(int[] A) {
        Set<Integer> distinctValues = new HashSet<>();
        for (int value : A) {
            distinctValues.add(value);
        }
        return distinctValues.size();
    }
}
