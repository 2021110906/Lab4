
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testExample1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, -4, 2),
                Arrays.asList(-1, 0, 1)
        );
        List<List<Integer>> result = solution.threeSum(nums);
        assertListEqualsIgnoreOrder(expected, result);
    }

    @Test
    public void testExample2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expected = new ArrayList<>();
        List<List<Integer>> result = solution.threeSum(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        List<List<Integer>> result = solution.threeSum(nums);
        assertListEqualsIgnoreOrder(expected, result);
    }

    // Helper method to assert two lists of lists are equal ignoring order
    private void assertListEqualsIgnoreOrder(List<List<Integer>> expected, List<List<Integer>> actual) {
        Set<Set<Integer>> expectedSet = new HashSet<>();
        for (List<Integer> list : expected) {
            expectedSet.add(new HashSet<>(list));
        }

        Set<Set<Integer>> actualSet = new HashSet<>();
        for (List<Integer> list : actual) {
            actualSet.add(new HashSet<>(list));
        }

        assertEquals(expectedSet, actualSet);
    }
}
