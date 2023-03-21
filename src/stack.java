import java.util.*;
public class stack
{
    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        // insertion
        s.push(2); // value
        s.push(6);
        // deletion
        s.pop();
        System.out.println(s.isEmpty());
        // Retrive top value
        System.out.println(s.peek());

    }
}
