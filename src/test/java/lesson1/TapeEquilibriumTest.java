package lesson1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TapeEquilibriumTest {
    private TapeEquilibrium tapeEquilibrium = new TapeEquilibrium();

    @Test
    public void shouldReturn1For3_1_2_4_3() throws Exception {
        assertThat(tapeEquilibrium.solution(new int[]{3, 1, 2, 4, 3})).isEqualTo(1);
    }
    @Test
    public void shouldReturn0For3_3() throws Exception {
        assertThat(tapeEquilibrium.solution(new int[]{3, 3})).isEqualTo(0);
    }
    @Test
    public void shouldReturn0For2_3_6() throws Exception {
        assertThat(tapeEquilibrium.solution(new int[]{2, 3, 6})).isEqualTo(1);
    }
}