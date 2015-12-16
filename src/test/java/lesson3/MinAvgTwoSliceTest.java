package lesson3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-13.
 */
public class MinAvgTwoSliceTest {
    private MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();

    @Test
    public void shouldReturn1ForArray4_2_2_5_1_5_8() {
        int solution = minAvgTwoSlice.solution(new int[]{4, 2, 2, 5, 1, 5, 8});
        assertThat(solution).isEqualTo(1);
    }
}
