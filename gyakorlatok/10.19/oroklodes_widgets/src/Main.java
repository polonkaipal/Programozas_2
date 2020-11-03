public class Main {

    public static void main(String[] args) {
        UIWidget widget = new UIWidget(true);
        TextBox box = new TextBox();
        box.setText("hello");

        show(box);
    }

    private static void show(UIWidget widget) {
        System.out.println(widget);
    }
}
