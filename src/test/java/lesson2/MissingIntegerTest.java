package lesson2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class MissingIntegerTest {
    private MissingInteger missingInteger = new MissingInteger();

    @Test
    public void shouldReturn5ForArray_1_3_6_4_1_2() {
        assertThat(missingInteger.solution(new int[]{1, 3, 6, 4, 1, 2})).isEqualTo(5);
    }

    @Test
    public void shouldReturn2ForArray_1() {
        assertThat(missingInteger.solution(new int[]{1})).isEqualTo(2);
    }

    @Test
    public void shouldReturn1ForArray_0() {
        assertThat(missingInteger.solution(new int[]{0})).isEqualTo(1);
    }

    @Test
    public void shouldReturn1ForArray_Minus1() {
        assertThat(missingInteger.solution(new int[]{-1})).isEqualTo(1);
    }

}
