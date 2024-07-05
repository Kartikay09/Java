import java.util.Scanner;

public class factorial {
    public static int fact(int number){
        int multi=1;
        for (int i=1;i<=number;i++){
            multi=i*multi;
        }
        return multi;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
    
}
