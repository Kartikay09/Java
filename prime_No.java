import java.util.Scanner;

public class prime_No {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        boolean isprime=true;

        if (n==2){
            System.out.println("Number is prime");
        }
        else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0){
                    isprime=false;
                }
            }
            if (isprime==true){
                System.out.println("number is prime");
            }
            else{
                System.out.println("not prime");
            }

        }
        
        
    }
    
}
