class PeakElement {
    public static int peak(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;  // Correct way to calculate mid to avoid overflow
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if(arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }

    public static void main(String args[]) {
        int arr[] = {3, 4, 5, 8,1,2};
        System.out.println("Peak Element---" + arr[peak(arr)]);
    }
}
