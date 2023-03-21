import java.util.*;
public class clonemap
{
    public static void main(String[] args) {
        HashMap<Integer,String> hash= new HashMap<>();
        hash.put(1,"Red");
        hash.put(2,"Red1");
        hash.put(3,"Red2");
        hash.put(4,"Red3");

    HashMap<Integer,String> hash1= new HashMap<>();
    // cloning a map
	hash1.putAll(hash);
        System.out.println(hash1);
    }
}
