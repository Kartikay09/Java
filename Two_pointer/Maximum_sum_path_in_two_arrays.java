package Two_pointer;

public class Maximum_sum_path_in_two_arrays {
    public static void main(String[] args) {
        int [] arr1={2, 3, 7, 10, 12};
        int [] arr2={1, 5, 7, 8};
        int i=0;
        int j=0;
        int si=0;
        int sj=0;
        int sum1=0;
        int sum2=0;
        int result=0;
        while(i<arr1.length && j<arr2.length){
            if (arr1[i]>arr2[j]){
                j++;
            }
            else if(arr2[j]>arr1[i]){
                i++;
            }
            else if(arr1[i]==arr2[j]){
                sum1=0;
                for(int k=si;k<=i;k++){
                    sum1+=arr1[k];
                }
                sum2=0;
                for(int k=sj;k<=j;k++){
                    sum2+=arr2[k];
                }
                result+=Math.max(sum2, sum1);
                i++;
                j++;
                si=i;
                sj=j;
            }
        }
        sum1=0;
        for(int k=si;k<arr1.length;k++){
            sum1+=arr1[k];
        }
        sum2=0;
        for(int k=sj;k<arr2.length;k++){
            sum2+=arr2[k];
        }
        result+=Math.max(sum2, sum1);
        System.out.println(result);
    }
    
}
