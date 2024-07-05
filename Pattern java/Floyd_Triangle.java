import java.util.Scanner;

public class Floyd_Triangle {
    public static void Pattern(int n,int num){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        Pattern(n, num);
    }
    
}
