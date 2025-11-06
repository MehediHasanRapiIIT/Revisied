import java.util.Scanner;

public class BinarySearchMergeSort {


    public static void conquer(int[] arr, int start, int mid, int end){
        int[] merged = new int[end-start+1];

        int idx1 = start;
        int idx2 = mid+1;
        int x = 0;

        while(idx1<=mid&&idx2<=end){
            if(arr[idx1]<=arr[idx2]){
                merged[x++]=arr[idx1++];
            }else{
                merged[x++]=arr[idx2++];
            }
        }

        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while(idx2<=end){
            merged[x++]=arr[idx2++];
        }

        for(int i= 0, j= start; i<merged.length; i++,j++){
            arr[j] =merged[i];
        }
    }

    public static void divide(int[] arr,int start,int end){
        if(start>=end){
            return;
        }

        int mid = start + (end - start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int i = 1;

        while (low <= high) {
            System.out.println("iteration: "+i);
            i++;
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements one by one:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array first using merge sort
        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int foundIndex = binarySearch(arr, target);
        if (foundIndex == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + foundIndex);
        }

        sc.close();
    }
}
