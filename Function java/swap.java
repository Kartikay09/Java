import java.util.Scanner;

public class swap{


    public static void after(int num1,int num2){
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println(num1);
        System.out.println(num2);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr two Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("After Swaping");
        after(a,b);
    }
}