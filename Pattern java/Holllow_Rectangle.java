 import java.util.Scanner;

public class Holllow_Rectangle {
    public static void Rectangle_Hollow(int row,int col){
        for (int i=1;i<=row;i++){
            // This loop for outer and Decide how many lines
            for (int j=1;j<=col;j++){
                // This loop iterate every element in a row
                if(i==1 ||i==row ||j==1 ||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the row");
        int row=sc.nextInt();
        System.out.println("Enter the col");
        int col=sc.nextInt();
        System.out.println("Your Pattern");
        Rectangle_Hollow(row,col);



    }
}