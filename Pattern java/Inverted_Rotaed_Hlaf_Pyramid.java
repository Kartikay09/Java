import java.util.Scanner;

public class Inverted_Rotaed_Hlaf_Pyramid {
    public static void Pattern(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The No.");
        int n=sc.nextInt();
        Pattern(n);
    }
    
}
