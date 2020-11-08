import java.util.List;

public class TestPyUtils {
    public static void main(String[] args) {
        test_range();
    }

    private static void test_range() {
        System.out.println("Start: test_range()");
        assert PyUtils.range(4, 20, 2).equals(List.of(4, 6, 8, 10, 12, 14, 16, 18));
        assert PyUtils.range(4, 10, 1).equals(List.of(4, 5, 6, 7, 8, 9));
        assert PyUtils.range(10, 4, 1).equals(List.of());
        assert PyUtils.range(0, 5).equals(List.of(0, 1, 2, 3, 4));
        assert PyUtils.range(3, 7).equals(List.of(3, 4, 5, 6));
        assert PyUtils.range(3, 4).equals(List.of(3));
        assert PyUtils.range(3, 3).equals(List.of());
        assert PyUtils.range(10).equals(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Stop: test_range()");
    }
}
