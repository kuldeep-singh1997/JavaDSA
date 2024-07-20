class AlternateSwap{

    static void alterSwap(int arr[],int len){
        int i=0;
        int j=1;

        while(((i+2)<len) && ((j+2)<len)){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }
    }
    public static void main(String s[]){
        int arr[]={1,2,3,4,5,6,7};
        alterSwap(arr,arr.length);
        System.out.println("After Swapping");
        for(int a : arr){
            System.out.print(a+" ");
        }
    }
}