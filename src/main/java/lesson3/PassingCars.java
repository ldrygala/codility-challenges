package lesson3;

/**
 * Created by ldrygala on 2015-12-13.
 */
public class PassingCars {
    public int solution(int[] A) {
        int result = 0;
        int ones = 0;
        for (int i = A.length - 1; i >= 0; i--) {
            int carDirection = A[i];
            if (carDirection == 1) {
                ones++;
            } else {
                result += ones;
                if (result > 1000000000) {
                    result = -1;
                    break;
                }
            }
        }
        return result;
    }
}
