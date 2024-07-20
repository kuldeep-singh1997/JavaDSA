class ReverseArray{
    static void reverseArr(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String a[]){
        int arr[]={2,1,3,3,1,99};
        reverseArr(arr);
        for(int ar: arr){
            System.out.println(ar);
        }
    }
}