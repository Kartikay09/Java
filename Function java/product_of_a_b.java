import java.util.Scanner;

public class product_of_a_b {

    public static int Multiply(int num1,int num2){
        int c=num1*num2;
        return c;
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(Multiply(a,b));

    }
    
}
