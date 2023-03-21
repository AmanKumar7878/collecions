import java.util.Scanner;

public class rootsOfQuadEqn
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Coffecient of X square:");
        int a= sc.nextInt();
        System.out.println("Enter Cofficient Of x:");
        int b= sc.nextInt();
        System.out.println("Enter Constant:");
        int c= sc.nextInt();
        //b±√(b²-4ac))/(2a)
        double r1= -(b+(Math.sqrt((b*b)-4*a*c)))/(2*a);
        double r2= -(b-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
        System.out.println(r1);
        System.out.println(r2);

    }
}
