import java.util.Scanner;

public class Binomial_cofficent {
    
    public static int Bio(int n,int r){
        int nfact=1;
        int rfact=1;
        int c=n-r;
        int nrfact=1;
        for (int i=1;i<=n;i++){
            nfact=nfact*i;
        }
        for (int j=1;j<=r;j++){
            rfact=rfact*j;
        }
        for (int k=1;k<=c;k++){
            nrfact=nrfact*k;
        }
        return (nfact/(rfact*nrfact));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(Bio(n,r));
    }
}
