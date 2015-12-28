package lesson4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-12-28.
 */
public class MaxProductOfThreeTest {
    private MaxProductOfThree maxProductOfThree = new MaxProductOfThree();

    @Test
    public void shouldCountMaxOfTreeFromTreePositiveElements(){
        Assertions.assertThat(maxProductOfThree.solution(new int[] {1,2,3})).isEqualTo(6);
    }

    @Test
    public void shouldCountMaxOfTreeFromFourPositiveElements(){
        Assertions.assertThat(maxProductOfThree.solution(new int[] {5,3,8,1})).isEqualTo(120);
    }

    @Test
    public void shouldCountMaxOfTreeFromSevenPositiveElements(){
        Assertions.assertThat(maxProductOfThree.solution(new int[] {5,3,5,9,12,4,10,3})).isEqualTo(1080);
    }

    @Test
    public void shouldCountMaxOfTreeFromPositiveAndNegativeElements(){
        Assertions.assertThat(maxProductOfThree.solution(new int[] {5,3,5,9,-12,4,-10,3})).isEqualTo(1080);
    }
}
