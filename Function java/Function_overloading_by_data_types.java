public class Function_overloading_by_data_types {

    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println(sum(4,5));
        System.out.println(sum(3.0f,4.0f));
    }
    
}
