class BinarySearch{
    public static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==target){
                ans=mid;
                return ans;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return ans;
    }
    public static void main(String a[]){
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println("Found at index "+search(arr,6));
        System.out.println("Found at index "+search(arr,7));
    }
}