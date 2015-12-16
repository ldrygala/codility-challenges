package lesson3;

/**
 * Created by ldrygala on 2015-12-13.
 */
public class MinAvgTwoSlice {
    public int solution(int[] A) {
        double[] averages = new double[A.length];
        double minAvg = Double.MAX_VALUE;
        int minIndex = A.length - 2;
        averages[A.length - 1] = A[A.length - 1];

        for (int i = A.length - 2; i >= 0; i--) {
            int e1 = A[i];
            int e2 = A[i + 1];
            double avg1 = average(e1, e2);
            double avg2 = average(e1, averages[i + 1]);
            double localMinAvg = Math.min(avg1, avg2);
            averages[i] = localMinAvg;
            if (minAvg >= localMinAvg) {
                minAvg = localMinAvg;
                minIndex = i;
            }
        }
        return minIndex;
    }

    private double average(double x, double y) {
        return (x + y) / 2;
    }
}
