package May23;

import java.util.Scanner;

public class BinarySearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int marks[] = {10, 20, 30, 40, 50, 60, 70};
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        int start = 0;
        int end = marks.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == marks[mid])
            {
                System.out.println("Element found at index: " + mid);
                break;
            }
            else if (target < marks[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
    }
}
