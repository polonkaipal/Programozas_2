public class TestMain {
    public static void main(String[] args) {
        test_main();
    }

    private static void test_main() {
        System.out.println("Start: test_main()");
        assert Main.product() == 0;
        assert Main.product(2) == 0;
        assert Main.product(2, 5) == 10;
        assert Main.product(2, 5, 10) == 100;
        assert Main.product(2, 5, 10, 3) == 300;
        System.out.println("Stop: test_main()");
    }
}
