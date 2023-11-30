import java.util.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Kamal");
        ll.add("Amal");
        ll.add("Damith");
        ll.add("Kavindu");
        ll.add("Amara");
        System.out.println(ll);
        System.out.println("Remove "+ll.remove(3) );
        System.out.println(ll);

    }
}
