import java.util.*;
public class hashset
{
    public static void main(String[] args)
    {
        HashSet<Integer> set = new HashSet<>();
        //insertion
        set.add(9);
        set.add(546);
        set.add(3);
        // size
        set.size();
        // search
        set.contains(9); // value search
        // deletion
        set.remove(9);
        //print
        System.out.println(set);
        // Iterate
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
