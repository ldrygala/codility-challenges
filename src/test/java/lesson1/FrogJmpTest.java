package lesson1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogJmpTest {
    private FrogJmp frogJmp = new FrogJmp();

    @Test
    public void shouldReturn3ForX10_Y85_D30() throws Exception {
        assertThat(frogJmp.solution(10, 85, 30)).isEqualTo(3);
    }
}