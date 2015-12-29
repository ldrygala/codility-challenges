package lesson4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-12-29.
 */
public class TriangleTest {
    private Triangle triangle = new Triangle();

    @Test
    public void shouldFindTriangle() {
        int result = triangle.solution(new int[]{10,2,5,1,8,10});
        Assertions.assertThat(result).isEqualTo(1);
    }
    @Test
    public void shouldNotFindTriangle() {
        int result = triangle.solution(new int[]{10,50,5,1});
        Assertions.assertThat(result).isEqualTo(0);
    }
}
