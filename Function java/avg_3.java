import java.util.Scanner;

public class avg_3 {
    public static int average_3(int a,int b,int c){
        int d=(a+b+c)/3;
        return d;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(average_3(a, b, c));
    }
    
}
