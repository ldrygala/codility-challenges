package lesson2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-08.
 */
public class FrogRiverOneTest {
    private FrogRiverOne frogRiverOne = new FrogRiverOne();

    @Test
    public void shouldReturn6AsEarliestTimeToJumpOn5ForArray_1_3_1_4_2_3_5_4() {
        assertThat(frogRiverOne.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4})).isEqualTo(6);
    }

    @Test
    public void shouldReturn0AsEarliestTimeToJumpOn1ForArray_1_1_1() {
        assertThat(frogRiverOne.solution(1, new int[]{1, 1, 1})).isEqualTo(0);
    }
}
