import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int target)
    {
        int n =  arr.length;

        for(int i =0;i<n;i++){
            if(arr[i]==target){
                return i;
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

        int foundIndex = linearSearch(arr, target);
        if(foundIndex == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+foundIndex);
        }

    }
}
