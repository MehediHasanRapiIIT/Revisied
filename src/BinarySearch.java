import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                high = mid-1;
            }
            if(target>arr[mid]){
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements one by one:");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        int foundIndex = binarySearch(arr, target);
        if(foundIndex == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+foundIndex);
        }

    }
}
