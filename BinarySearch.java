import java.util.ArrayList;
import java.util.Collections;

import javafx.print.Collation;

class BinarySearch{
    public static void main(String[] args) {
        // int arr[]=new int[]{1,2,3,4,5,6,7,8};
        // int start=0;
        // int end=arr.length-1;
        // int mid=(start+end)/2;
        // int key=100;
        // int index=-1;
        // while(start<end){
        //     System.out.println("--------"+arr[mid]);
        //     if(arr[mid]==key){
        //         System.out.println("Insde");
        //         index=mid;
        //         break;
        //     }
        //     if(arr[mid]>key)
        //         end=mid-1;
		// 	else
		// 		start=mid+1;
			
		// 	mid=(start+end)/2;
        // }
        // System.out.println("Index is --   "+index);
        int arr[]=new int[]{1,2,3,4,5};
        int start=0;
        int end=arr.length-1;
        ArrayList<Integer> arList=new ArrayList<>();
        for(int i:arr){
            arList.add(Integer.valueOf(i));
        }
        Collections.reverse(arList);
        for(int i=0;i<arList.size();i++){
           System.out.println("----------"+arList.get(i));
        }
        
    }
}