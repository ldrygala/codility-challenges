package lesson2;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];
        int localMax = 0;
        int globalMax = 0;
        for (int i = 0; i < A.length; i++) {
            int value = A[i];
            int counterIndex = value - 1;

            if (shouldIncrease(N, value)) {
                int newCounterValue = ++counters[counterIndex];
                if (newCounterValue > localMax) {
                    localMax = newCounterValue;
                }
            } else if (shouldMaxCounter(N, value)) {
                counters = new int[N];
                globalMax+=localMax;
                localMax=0;
            }
        }
        maxCounters(counters,globalMax);
        return counters;
    }

    private void maxCounters(int[] counters, int maxCounterValue) {
        for (int i = 0; i < counters.length; i++) {
            counters[i] += maxCounterValue;
        }
    }

    private boolean shouldMaxCounter(int N, int value) {
        return value - 1 == N;
    }

    private boolean shouldIncrease(int N, int value) {
        return value <= N && value >= 1;
    }
}
