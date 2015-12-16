package lesson2;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class MissingInteger {
    public int solution(int[] A) {
        int [] numbers = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int number = A[i];
            if(number > 0 && number <= A.length) {
                numbers[number-1] = 1;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if(number == 0) {
                return i+1;
            }

        }
        return numbers.length+1;
    }
}
