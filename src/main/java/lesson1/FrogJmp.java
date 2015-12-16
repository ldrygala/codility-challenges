package lesson1;

/**
 * Created by ldrygala on 2015-12-05.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int result = (Y - X) / D;
        if ((Y - X) % D != 0) {
            result++;
        }
        return result;
    }
}
