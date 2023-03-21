import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char a;
         a = sc.next().charAt(0);
        if(Character.isAlphabetic(a)){
            System.out.println("Alphabet");
        }
        else if(Character.isDigit(a)){
            System.out.println("digit");
        }
        else{
            System.out.println("special Character");}
    }
    }

