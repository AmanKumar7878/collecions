import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();

        int n = sc.nextInt();

        while(n-->0){
            String str1 = sc.next();
            String str2= sc.next();
            sc.nextLine();
            set.add(str1+" "+str2);
            System.out.println(set.size());

        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

