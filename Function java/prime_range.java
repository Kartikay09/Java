import java.util.Scanner;

public class prime_range {

    public static boolean prime(int n){
        boolean isprime=true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primerange(int n){
        for (int i=2 ;i<=n;i++){
            if (prime(i)==true){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primerange(n);
    }
    
}
