import java.util.Scanner;

public class LargestNumber {

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array one by one:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("arrays elements are:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        int largestValue = findLargest(arr);
        System.out.println("The largest number in the array is: " + largestValue);
    }
}
