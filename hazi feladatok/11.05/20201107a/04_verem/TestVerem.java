import java.util.List;

public class TestVerem {
    public static void main(String[] args) {
        test_size();
        test_isEmpty();
        test_toString();
        test_append();
        test_pop();
    }

    private static void test_size() {
        System.out.println("Start: test_size()");
        Verem v1 = new Verem();
        assert v1.size() == 0;
        v1 = new Verem(List.of(2, 4, 6));
        assert v1.size() == 3;
        v1 = new Verem(List.of(2, 4));
        assert v1.size() == 2;
        System.out.println("Stop: test_size()");
    }

    private static void test_isEmpty() {
        System.out.println("Start: test_isEmpty()");
        Verem v1 = new Verem();
        assert v1.isEmpty() == true;
        v1 = new Verem(List.of(2, 4, 6));
        assert v1.isEmpty() == false;
        v1 = new Verem(List.of(2, 4));
        assert v1.isEmpty() == false;
        System.out.println("Stop: test_isEmpty()");
    }

    private static void test_toString() {
        System.out.println("Start: test_toString()");
        Verem v1 = new Verem();
        assert v1.toString().equals("[");
        v1 = new Verem(List.of(2, 4, 6));
        assert v1.toString().equals("[2, 4, 6");
        v1 = new Verem(List.of(2, 4));
        assert v1.toString().equals("[2, 4");
        System.out.println("Stop: test_toString()");
    }

    private static void test_append() {
        System.out.println("Start: test_append()");
        Verem v1 = new Verem();
        v1.append(2);
        assert v1.toString().equals("[2");
        v1.append(4);
        assert v1.toString().equals("[2, 4");
        v1.append(6);
        assert v1.toString().equals("[2, 4, 6");
        System.out.println("Stop: test_append()");
    }

    private static void test_pop() {
        System.out.println("Start: test_pop()");
        Verem v1 = new Verem(List.of(2, 4, 6));
        assert v1.pop() == 6;
        assert v1.toString().equals("[2, 4");
        assert v1.pop() == 4;
        assert v1.toString().equals("[2");
        assert v1.pop() == 2;
        assert v1.toString().equals("[");
        System.out.println("Stop: test_pop()");
    }
}
