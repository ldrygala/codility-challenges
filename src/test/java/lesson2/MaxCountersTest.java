package lesson2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class MaxCountersTest {
    private MaxCounters maxCounters = new MaxCounters();

    @Test
    public void shouldReturn3_2_2_4_2For5And3_4_4_6_1_4_4() {
        assertThat(maxCounters.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})).isEqualTo(new int[]{3,2,2,4,2});
    }



}
