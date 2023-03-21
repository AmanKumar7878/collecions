import java.util.Scanner;

public class javaBasics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base:");

        int b=sc.nextInt();
        System.out.println("Enter Height:");
        int h=sc.nextInt();
        double d = (double)1/2;
        System.out.println(d*b*h);

    }
}
