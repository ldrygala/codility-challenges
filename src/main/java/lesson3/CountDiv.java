package lesson3;

/**
 * Created by ldrygala on 2015-12-11.
 */
public class CountDiv {
    public int solution(int A, int B, int K) {
        int result = 0;
        while (A % K != 0) {
            A++;
        }
        if (A <= B) {
            result = 1;
        }
        return result + (B - A) / K;
    }
}
