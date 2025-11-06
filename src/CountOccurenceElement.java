import java.util.Scanner;

public class CountOccurenceElement {

    public static void countOccurence(int[] arr, int target){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println("Element "+target+" occurs "+count+" times.");
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
        System.out.print("\nEnter the target element to count its occurrences: ");
        int target = sc.nextInt();
        countOccurence(arr, target);

    }
}
