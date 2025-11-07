import java.util.Scanner;

public class MoveZeroToLast {

    public static void moveZerosToEnd(int[] arr){
        int nonZeroIndex = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[nonZeroIndex]=arr[i];
                nonZeroIndex++;
            }
        }

        while(nonZeroIndex<arr.length){
            arr[nonZeroIndex]=0;
            nonZeroIndex++;
        }
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
        moveZerosToEnd(arr);
        System.out.println("\nArray after moving zeros to the end:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
