import java.util.Scanner;

public class Function_prime {

    public static void primeno(int n){

        if (n==2){
            System.out.println("Number is prime");
        }
        else{
            boolean isprime=true;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                isprime=false;
            }
        }
        if (isprime==true){
            System.out.println("Number is prime");   
        }
            
        else{
            System.out.println("Number is not prime");
        }
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        primeno(n);

    }
    
}
