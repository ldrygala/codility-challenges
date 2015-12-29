package lesson4;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-12-29.
 */
public class DistinctTest {
    private Distinct distinct = new Distinct();

    @Test
    public void shouldReturnNumberOfDistinctValues(){
        int distinctValues = distinct.solution(new int[]{1,2,3,4,1,3,4,5});
        Assertions.assertThat(distinctValues).isEqualTo(5);
    }

    @Test
    public void shouldReturnZeroDistinctValuesForEmptyArray(){
        int distinctValues = distinct.solution(new int[]{});
        Assertions.assertThat(distinctValues).isEqualTo(0);
    }
}
