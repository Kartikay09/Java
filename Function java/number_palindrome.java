import java.util.Scanner;

public class number_palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rem=0;
        while(n>0){
            int ld=n%10;
            rem=(rem*10)+ld;
            n=n/10;
        }
        if (original==rem){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
    
}
