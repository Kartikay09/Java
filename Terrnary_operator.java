import java.util.Scanner;

public class Terrnary_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        int age =sc.nextInt();

        String kartikay=(age>18)? "1":"2";
        System.out.println(kartikay);

        //Ternnary operator

        // String b=(a%2==0)? "even":"odd";
        // System.out.println(b);

        String type=(marks>=33)? "pass":"Fail";
        System.out.println(type);
    }
    
}
