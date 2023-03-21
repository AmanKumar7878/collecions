import java.util.Scanner;

public class areaOfCuboid
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l= sc.nextInt();
        int b= sc.nextInt();
        int h= sc.nextInt();
        // Formula : 2(lb+bh+hl)
        System.out.println(2*((l*b)+(b*h)+(h*l)));

    }
}
