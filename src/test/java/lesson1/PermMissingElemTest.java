package lesson1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PermMissingElemTest {
    private PermMissingElem permMissingElem = new PermMissingElem();

    @Test
    public void shouldReturn4For2_3_1_5() throws Exception {
        assertThat(permMissingElem.solution(new int[]{2, 3, 1, 5})).isEqualTo(4);
    }
}