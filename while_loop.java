import java .util.*;
public class while_loop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number");
        int n=sc.nextInt();
        int a=1;
        int sum=0;
        while (a<=n){
           sum=sum+a;
           
           a++;
        }
        System.out.println(sum);
        
    }
}
