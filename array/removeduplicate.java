import java.util.Arrays;
import java.util.Scanner;

public class removeduplicate {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);


    System.out.print("Enter Size Of The Array: ");
    int n = sc.nextInt();

    int arr[] = new int[n];

    System.out.print("Enter elements of the array: ");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);

    System.out.println("Array after removing duplicates:");

    for (int i = 0; i < n; i++) {
        if (i == 0 || arr[i] != arr[i - 1]) {
            System.out.print(arr[i] + " ");
        }
    }

    sc.close();
}


}
