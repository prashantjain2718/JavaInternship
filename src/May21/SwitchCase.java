package May21;

import java.util.Scanner;

public class SwitchCase {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int days = sc.nextInt();
//        switch (days) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("Invalid day");
//        }


        // without break keyword
    int days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.println("Monday");
//                break;
            case 2:
                System.out.println("Tuesday");
//                break;
            case 3:
                System.out.println("Wednesday");
//                break;
            case 4:
                System.out.println("Thursday");
//                break;
            case 5:
                System.out.println("Friday");
//                break;
            case 6:
                System.out.println("Saturday");
//                break;
            case 7:
                System.out.println("Sunday");
//                break;
            default:
                System.out.println("Invalid day");
        }
    }
}
