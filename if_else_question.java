// Print largest of two numbers:
import java.util.*;
public class if_else_question {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if (a>b && a>c){
            System.out.println("a is greatre to both numbers");
            
        }
        else if (b>c){
            System.out.println("b is greater than both");
        }
        else{
            System.out.println("c is greaterr than both ");
        }

       // print even or odd 

        int a=sc.nextInt();
        
        if (a%2==0){
            System.out.println("a is a even number");
        }
        else{
            System.out.println("a is a odd number");
        }

        //Tax Calucaltor

        int Income=sc.nextInt();
        int Tax=0;

        if(Income<500000){
            System.out.println("you dose not paid any tax");
        }
        if (Income>=500000 && Income<1000000){
             Tax=(int)(Income*0.2f);
            System.out.println("you paid tax"+Tax);
        }
        if (Income>=1000000){
             Tax=(int)(Income*0.3f);
            System.out.println("you paid tax"+Tax);
        }
    }

    
}
