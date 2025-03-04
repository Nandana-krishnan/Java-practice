package array;
import java.util.Scanner;
public class ArrayNe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();  // Consume the newline character after nextInt()

        String[] arr = new String[n];
        System.out.println("Enter the strings:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("You entered:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        sc.close();  // Close the scanner to prevent resource leaks
    }
}
