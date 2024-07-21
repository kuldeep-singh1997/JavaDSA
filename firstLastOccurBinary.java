class firstLastOccurBinary{
    public static int firstSearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        int ans=-1;
        while(start<=end){
            if(arr[mid]==target){
                ans=mid;
                mid=end;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return ans;
    }
    public static int LastSearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;//start+(end-start)/2
        int ans=-1;
        while(start<=end){
            if(arr[mid]==target){
                ans=mid;
                mid=start;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,3,3,3,4};
        System.out.println("First Index---"+firstSearch(arr,3));
        System.out.println("First Index---"+LastSearch(arr,3));
    }
}