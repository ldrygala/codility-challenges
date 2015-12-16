package lesson3;

/**
 * Created by ldrygala on 2015-12-14.
 */
public class GenomicRangeQuery {
    private int[][] impact2char;

    public int[] solution(String S, int[] P, int[] Q) {
        initImpact2Char(S);
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];
            if (startIndex == 0) {
                result[i] = findMinForChar(endIndex);
            } else {
                result[i] = findMinForChar(impact2char[startIndex-1], impact2char[endIndex]);
            }
        }
        return result;
    }

    private int findMinForChar(int[] start, int[] end) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if ((end[i] - start[i]) != 0) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException();


    }

    private int findMinForChar(int endIndex) {
        return findMinForChar(impact2char[endIndex], new int[4]);
    }

    private void initImpact2Char(String S) {
        char[] chars = S.toCharArray();
        impact2char = new int[chars.length][4];
        for (int i = 0; i < chars.length; i++) {
            int impact = chart2Impact(chars[i]);
            if (i >= 1) {
                for (int j = 0; j < 4; j++) {
                    impact2char[i][j] = impact2char[i - 1][j];
                    if (impact - 1 == j) {
                        impact2char[i][j]++;
                    }

                }
            } else {
                impact2char[i][impact - 1]++;
            }
        }
    }


    private int chart2Impact(char c) {
        if (c == 'A') {
            return 1;
        } else if (c == 'C') {
            return 2;
        } else if (c == 'G') {
            return 3;
        } else {
            return 4;
        }
    }
}
