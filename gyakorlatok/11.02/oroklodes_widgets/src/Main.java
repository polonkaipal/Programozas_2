public class Main {

    public static void main(String[] args) {
        /*UIWidget widget = new UIWidget(true);
        TextBox box = new TextBox();
        box.setText("hello");

        show(widget);
        show(box);*/

        UIWidget[] widgets = {new TextBox(), new RadioButton()};
        for (UIWidget widget : widgets) {
            // if widget is Textbox, then
            //     renderTextbox(widget)
            // else if widget is RadioButton, then
            //     renderRadioButton(widget)
            widget.render();
        }
    }

    /*private static void show(UIWidget widget) {
        if (widget instanceof TextBox) {
            TextBox box = (TextBox) widget;
            box.setText("world");
        }

        System.out.println(widget);
    }*/
}
