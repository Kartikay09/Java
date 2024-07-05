import java.util.Scanner;

public class square_pattern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        
        for (int i=1;i<=n;i++){
            if (i==n){
                System.out.println("****");
            }
            
        }
        System.out.println();
        // while (i<=n){
        //     System.out.println("****");
        //     i++;
        // }

    }    
    
}
