import java.awt.*;
import java.util.LinkedList;


public class addNewElement {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        System.out.println(ll);
        ll.add(2,25);
        System.out.println(ll);
    }
}
