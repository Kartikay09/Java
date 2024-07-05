public class Function_overloading_by_parameter {

    public static int sum(int a,int b){
        int d=a+b;
        return d;
    }
    public static int sum(int a,int b,int c){
        int e=a+b+c;
        return e;
    }
    public static void main(String args[]){
        int a=3;
        int b=4;
        int c=5;
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }    
}
