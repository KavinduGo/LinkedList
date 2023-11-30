import java.util.LinkedList;

public class ChangeElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Java");
        ll.add("Python");
        ll.add("C++");
        ll.set(2,"Java Script");
        System.out.println(ll);
    }
}
