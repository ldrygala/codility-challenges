package lesson3;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * Created by ldrygala on 2015-12-14.
 */
public class GenomicRangeQueryTest {
    private GenomicRangeQuery genomicRangeQuery = new GenomicRangeQuery();

    @Test
    public void shouldCountCorrect() {
        int P [] = new int[] {2,5,0};
        int Q [] = new int[] {4,5,6};
        String S = "CAGCCTA";

        int [] result = genomicRangeQuery.solution(S,P,Q);

        Assertions.assertThat(result).isEqualTo(new int [] {2,4,1});
    }

}
