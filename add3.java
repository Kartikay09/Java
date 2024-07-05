import java.util.Scanner;

public class add3 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);

        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int d=(a+b+c)/3;
        // System.out.println(d);

        // int a=sc.nextInt();
        // int b=a*a;
        // System.out.println(b)

        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
        float Total=pencil+pen+eraser;
        System.out.println(Total);
        float gst=Total+(Total*0.18f);
        System.out.println(gst);
    
    }
}
