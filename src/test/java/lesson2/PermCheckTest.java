package lesson2;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-09.
 */
public class PermCheckTest {
    private PermCheck permCheck = new PermCheck();

    @Test
    public void shouldReturn1ForArray_4_1_3_2() {
        assertThat(permCheck.solution(new int[]{4, 1, 3, 2})).isEqualTo(1);
    }


    @Test
    public void shouldReturn0ForArray_3_1_3_2() {
        assertThat(permCheck.solution(new int[]{3, 1, 3, 2})).isEqualTo(0);
    }

    @Test
    public void shouldReturn0ForArray_4_1_3() {
        assertThat(permCheck.solution(new int[]{4, 1, 3})).isEqualTo(0);
    }
}
