import java.util.*;
// it accepts only two values a key and a value.
public class hashmap
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hash = new HashMap<>();
        // Empty check
        System.out.println(hash.isEmpty());
        // Insertion
        hash.put(12,"aman");
        hash.put(1,"Red");
        hash.put(2,"Red1");
        hash.put(3,"Red2");
        hash.put(4,"Red3");

        // Size
        System.out.println(hash.size());
        // Iteration
        for(Map.Entry x: hash.entrySet()){
            System.out.println(x.getKey()+" "+x.getValue());
        }
        // IsEmpty?.
        System.out.println(hash.isEmpty());
        // cloning a map:- use putAll() method. if it have elements alredy  in this case they will be reserved.
        //shallow cloning:
        HashMap<Integer,String> hash3 = new HashMap<>();
        hash3 = (HashMap)hash.clone();
        System.out.println("Shallow Cloned Map : "+hash3);
        hash3.put(9,"am");
        System.out.println(hash3);
        // checks is exists or not.
        System.out.println(hash.containsKey(1));
        // checks value exists or not.
        System.out.println(hash.containsValue("aman6"));
        // get value.
        System.out.println(hash.get(1));
    }
}
