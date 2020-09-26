import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tomb1 = { 2, 9, 3, 8, 5 };
        int[] tomb2 = { 2, 9, 3, 8, 500 };

        Arrays.fill(tomb2, 3);

        System.out.println(Arrays.toString(tomb1));
        System.out.println(Arrays.equals(tomb1, tomb2));
        System.out.println(Arrays.toString(tomb2));

        Arrays.sort(tomb1);
        System.out.println(Arrays.toString(tomb1));

        MyArrayUtils.reverse(tomb1);
        System.out.println(Arrays.toString(tomb1));
    }
}