public class TestMyUtils {
    public static void main(String[] args) {
        test_duplaz();
        test_strlen();
    }

    private static void test_duplaz() {
        System.out.println("Start: test_duplaz()");
        assert MyUtils.duplaz(6) == 12;
        assert MyUtils.duplaz(0) == 0;
        assert MyUtils.duplaz(2) == 4;
        assert MyUtils.duplaz(-2) == -4;
        assert MyUtils.duplaz(8) == 16;
        System.out.println("Stop: test_duplaz()");
    }

    private static void test_strlen() {
        System.out.println("Start: test_strlen()");
        assert MyUtils.strlen("hellóka") == 7;
        assert MyUtils.strlen("") == 0;
        assert MyUtils.strlen("1") == 1;
        assert MyUtils.strlen("2") == 1;
        assert MyUtils.strlen("a") == 1;
        assert MyUtils.strlen("abcde") == 5;
        System.out.println("Stop: test: strlen()");
    }
}
