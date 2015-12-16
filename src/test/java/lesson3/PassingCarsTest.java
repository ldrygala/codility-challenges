package lesson3;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by ldrygala on 2015-12-13.
 */
public class PassingCarsTest {
    private PassingCars passingCars = new PassingCars();

    @Test
    public void shouldReturn5PassingCarsForArray_0_1_0_1_1(){
        assertThat(passingCars.solution(new int[]{0, 1, 0, 1, 1})).isEqualTo(5);
    }

    @Test
    public void shouldReturn0PassingCarsForArray_0_0_0_0_0(){
        assertThat(passingCars.solution(new int[]{0, 0, 0, 0, 0})).isEqualTo(0);
    }

    @Test
    public void shouldReturn0PassingCarsForArray_1_1_1_1_1(){
        assertThat(passingCars.solution(new int[]{1, 1, 1, 1, 1})).isEqualTo(0);
    }
    @Test
    public void shouldReturn4PassingCarsForArray_0_1_1_1_1(){
        assertThat(passingCars.solution(new int[]{0, 1, 1, 1, 1})).isEqualTo(4);
    }
}
