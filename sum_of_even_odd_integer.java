import java.util.Scanner;

public class sum_of_even_odd_integer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        int evensum=0;;
        int oddsum=0;
        int choice;


        do{
            System.out.println("Enetr the number");
            num=sc.nextInt();
            if (num%2==0){
                evensum+=num;
            }
            else{
                oddsum+=num;

            }
                System.out.println("To Contiune? 1 for yes or 0 for no");
            choice =sc.nextInt();
        }while(choice==1);
        System.out.println("odd Number sum"+" "+oddsum);
        System.out.println("even Number sum"+" "+evensum);
    }
}
