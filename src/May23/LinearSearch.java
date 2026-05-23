package May23;
import java.util.Scanner;
public class LinearSearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int marks[] = {30,20,40,50,10,70};
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        for(int i = 0; i<marks.length;i++){
            if(target == marks[i])
                System.out.println("Element found at index: " + i);
        }
    }
}
