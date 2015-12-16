package lesson3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-12-11.
 */
public class CountDivTest {
    private CountDiv countDiv = new CountDiv();

    @Test
    public void shouldReturn3DivsForA6_B11_K2() {
        Assertions.assertThat(countDiv.solution(6,11,2)).isEqualTo(3);
    }
    @Test
    public void shouldReturn1DivsForA1_B1_K1() {
        Assertions.assertThat(countDiv.solution(1,1,1)).isEqualTo(1);
    }
    @Test
    public void shouldReturn2DivsForA1_B2_K1() {
        Assertions.assertThat(countDiv.solution(1,2,1)).isEqualTo(2);
    }
    @Test
    public void shouldReturn2DivsForA1_B2_K2() {
        Assertions.assertThat(countDiv.solution(1,2,2)).isEqualTo(1);
    }
    @Test
    public void shouldReturn0DivsForA1_B2_K3() {
        Assertions.assertThat(countDiv.solution(1,2,3)).isEqualTo(0);
    }
}
