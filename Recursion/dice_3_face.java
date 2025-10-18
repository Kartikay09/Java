package Recursion;
public class dice_3_face {
    public static void main(String[] args) {
        int n=4;
        
        String ans="";
        cal(n, 0, ans);
        System.out.println(count(n, 0, ans));
    }
    public static void cal(int n,int curr,String ans){
        if(curr==n){
            System.out.print(ans+" ");
            return;
        }
        if(curr>n){
            return;
        }
        for(int i=1;i<=3;i++){
            cal(n, curr+i, ans+i);
        }
        // cal(n, curr+1, ans+1);
        // cal(n, curr+2, ans+2);
        // cal(n, curr+3, ans+3);
    }
     public static int  count(int n,int curr,String ans){
        if(curr==n){
            // System.out.print(ans+" ");
            return 1;
        }
        if(curr>n){
            return 0;
        }
        int c=0;
        for(int i=1;i<=3;i++){
            c+=count(n, curr+i, ans+i);
        }
        return c;
        // cal(n, curr+1, ans+1);
        // cal(n, curr+2, ans+2);
        // cal(n, curr+3, ans+3);
    }
    
}
