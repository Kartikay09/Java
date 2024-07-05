import java.util.Scanner;

public class Binary_to_decimal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number in Binary");
        int n=sc.nextInt();
        int decimal=0;
        int pow=0;
        while(n>0){
            int ld=n%10;
            decimal=decimal+(int)(ld*Math.pow(2, pow));
            pow++;
            n=n/10;
        }
        System.out.println(decimal);
            
    }
}
