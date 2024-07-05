import java.util.Scanner;

public class even_odd {

    public static boolean check_even_odd(int a){
        if (a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(check_even_odd(a));
    }
    
}
