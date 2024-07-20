class UniqueElement{
    static int uniqueEle(int arr[]){
        int ans=0;
        for(int a : arr){
            ans=ans^a;
        }
        return ans;
    }
    public static void main(String str[]){
        int arr[]={7,1,2,3,1,2,3};
        int ans=uniqueEle(arr);
        System.out.println("ans  "+ans);
    }
}