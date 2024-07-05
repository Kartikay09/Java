// import java.util.Scanner;

// public class add {
    
//     public static void main(String args[])
//     {
        // here i define the variable
        // int a =10;
        // int b = 5;
        // int c = a+b; //it is use to calculate the sum
        // System.out.println(a);
        // System.out.println(c);

        // a=20;
        // System.out.println(a);/

// import java.util.Scanner;

// public class Solution {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = scan.nextInt();
//         scan.nextLine();
//         String s=scan.nextLine();
//         double d=scan.nextDouble();

//         // Write your code here.

//         System.out.println("String: " + s);
//         System.out.println("Double: " + d);
//         System.out.println("Int: " + i);
//     }
// }

import java.util.Scanner;

public class practice{
        public static void main(String args[]){
                // int age=2;
                // if(age>=18){
                //         System.out.println("Eligible for vote"+age);
                // }
                // else{
                //         System.out.println("not eligible");
                // }

                Scanner sc=new Scanner(System.in);

                
                do{
                        System.out.println("Enetr the number");
                        int n=sc.nextInt();
                        
                        if (n%10==0){
                                continue;
                        }
                        
                
                        System.out.println(n);
                }while (true);
                
        }
}
    

