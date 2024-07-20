import java.io.*;
import java.util.* ;

public class PairSum{
    public static List<int[]> pairSum(int[] arr, int s) {
        Arrays.sort(arr);
        List<int[]> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==s){
                    int res[]=new int[2];
                    res[0]=Math.min(arr[i],arr[j]);
                    res[1]=Math.max(arr[i],arr[j]);
                    ans.add(res);
                }
            }
        }
        return ans;
    }
    public static void main(String a[]){
        int arr[]={0,1,2,3,4,5};
        int s=5;
        List<int[]> ans=pairSum(arr,s);
        for(int[] ans1 : ans){
            for(int an : ans1){
                System.out.print(an+" ");
            }
        }
    }
}