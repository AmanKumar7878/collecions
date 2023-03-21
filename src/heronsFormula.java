import java.util.Scanner;

import static java.lang.Math.sqrt;

public class heronsFormula
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double s1= sc.nextDouble();
        double s2= sc.nextDouble();
        double s3= sc.nextDouble();
        double c= (double)1/2;
        double s= c*(s1+s2+s3);
        double area = sqrt(s*(s-s1)*(s-s2)*(s-s3));

        System.out.println(area);
    }
}
