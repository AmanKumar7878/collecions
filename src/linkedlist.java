import java.util.*;
public class linkedlist
{
    public static void main(String[] args)
    {

        LinkedList<String> list = new LinkedList<>();
        // Insertion
        list.add("aman"); // It adds value at last.
        list.addFirst("aman1");
        list.addLast("prince");
        list.add("aman kumar");
        // Size
        System.out.println(list.size());
        // print
        System.out.println(list);
        // Retrive
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        // deletion
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
