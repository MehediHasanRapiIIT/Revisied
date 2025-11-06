import java.util.Scanner;

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr){
        int largest = arr[0];
        int secondLargest = arr[1];
        for (int i = 0; i < arr.length; i++){

            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
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
        int secondLargestValue = findSecondLargest(arr);
        System.out.println("\nThe second largest number in the array is: " + secondLargestValue);

    }
}
