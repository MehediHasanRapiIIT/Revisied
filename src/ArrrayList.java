import java.util.Scanner;

public class ArrrayList {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int x= sc.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            if(numbers[i]==x){
                System.out.println("x = "+i);
            }
        }
    }

}
