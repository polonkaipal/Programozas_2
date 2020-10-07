import java.util.ArrayList;
import java.util.List;

public class Verem {
    private List<Integer> li;

    public void push(int e) {
        this.li.add(e);
    }

    public int pop() {
        return li.remove(li.size() - 1);
    }

    public int size() {
        return li.size();
    }

    public boolean isEmpty() {
        return li.isEmpty();
    }

    @Override
    public String toString() {
        String result = this.li.toString();
        return result.replace("]", "");
    }

    public Verem() {
        li = new ArrayList<Integer>();
    }
}
