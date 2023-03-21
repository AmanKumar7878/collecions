import java.util.*;

public class arraylist
{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Insertion
        list.add(0,2);
        list.add(9);  // add element
        list.add(12);
        list.add(5);
        list.add(3);
        // print
        System.out.println(list);
        System.out.println("After Sort");
        // sorting
        Collections.sort(list);
        System.out.println(list);
        // Retrive
        System.out.println(list.get(2));
         // Remove at index
        list.remove(2);
        // Update
        list.set(2,5);
        // Get Size
        int s = list.size();
        System.out.println(s);
        System.out.println(list);
    }
}
