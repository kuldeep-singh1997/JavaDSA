class Sort01 {
    // Two-pointer approach
    public static void sortArr(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Move the start pointer to the right as long as arr[start] is 0
            while (start < end && arr[start] == 0) {
                start++;
            }
            // Move the end pointer to the left as long as arr[end] is 1
            while (start < end && arr[end] == 1) {
                end--;
            }
            // Swap arr[start] and arr[end]
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }
    public static void Sort01ThreePointer(int arr[]){
         int i=0,start=0,end=n-1;
        
        
        // while(start<=end)
        // {
        //     if(arr[i]==0)
        //     {
        //         swap(arr[start++],arr[i++]);
        //     }
        //     else
        //     {
        //         swap(arr[i],arr[end--]);
        //     }
        // }
    }
    public static void main(String s[]) {
        int arr[] = {1, 1, 1, 0, 1, 0, 0, 0, 1};
        sortArr(arr);
        for (int a : arr) {
            System.out.print(a + "  ");
        }
    }
}
