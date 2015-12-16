package lesson2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ldrygala on 2015-12-08.
 */
public class FrogRiverOne {
    public int solution(int X, int[] A) {
        Set<Integer> leaves = new HashSet<>();
        int leafCount = 0;
        for (int i = 0; i < A.length; i++) {
            int leaf = A[i];
            if (leaf <= X) {
                boolean added = leaves.add(leaf);
                if (added && ++leafCount == X) {
                    return i;
                }
            }
        }
        return -1;
    }
}
