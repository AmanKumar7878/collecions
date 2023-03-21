import java.util.Scanner;

public class soln

{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int num = sc.nextInt();
            int v;
            long e=0;
            long o=0;
            for (int i = 0; i < num; i++) {
                v= sc.nextInt();
                if(v%2==0){
                    e=e+v;
                }
                else{
                    o=o+v;
                }

            }
            if(e<=o){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
