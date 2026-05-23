package Tasks;
import java.util.Scanner;
public class Conditionals {
    static void main() {
        Scanner sc = new Scanner(System.in);
        /*
        // Task1: Write a program to find maximum between two numbers
        System.out.print("Enter the number1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number2: ");
        int b = sc.nextInt();

        if(a>=b)
            System.out.println("Maximum number: " + a);
        else
            System.out.println("Maximum number: " + b);

        // Output
//        Enter the number1: 56
//        Enter the number2: 34
//        Maximum number: 56
*/


/*
        // Task 2: wap to find the largest of three numbers
        System.out.print("Enter the number1: ");
        int a = sc.nextInt();
        System.out.print("Enter the number2: ");
        int b = sc.nextInt();
        System.out.print("Enter the number3: ");
        int c = sc.nextInt();

        int largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("Maximum number: " + largest);
        // Output
//        Enter the number1: 23
//        Enter the number2: 78
//        Enter the number3: 90
//        Maximum number: 90
*/

        /*
        // Task 3: wap to check whether a number is +ve, -ve or zero
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num>0)
            System.out.println("Positive number");
        else if(num<0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
        // Output
//        Enter the number: -4
//        Negative number

         */

        /*
        // Task 4: wap to check whether a number is divisible by 5 and 11 or not
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num%5 == 0 && num%11 == 0)
            System.out.println("This number is divisible by 5 and 11");
        else
            System.out.println("This number is not divisible by 5 and 11");
        // Output:
//        Enter the number: 125
//        This number is not divisible by 5 and 11
        */

        /*
        // Task 5: write a program to input any alphabet and check whether it is vowel or consonant
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("This is a vowel");
        else
            System.out.println("This is a consonant");
        // Output:
//        Enter the character: e
//        This is a vowel
        */

        /*
        // Task 6: wap to check if a character is alphabet, digit or special character
        System.out.print("Enter the value: ");
        char ch = sc.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            System.out.println("This is a Alphabet");
        else if(ch >= '0' && ch <= '9')
            System.out.println("This is a number");
        else
            System.out.println("This is a special character");
        // Output:
//        Enter the value: 34
//        This is a number

         */

        /*
        // Task 7: wap to check whether an alphabet is upper case or lower case
        System.out.print("Enter an alphabet: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z')
            System.out.println("Upper case");
        else if(ch >= 'a' && ch <= 'z')
            System.out.println("Lower case");
        else
            System.out.println("Not an alphabet");
        // Output:
//        Enter an alphabet: t
//        Lower case
*/

        /*
        // Task 8: wap to enter week number and find week day
        int days = sc.nextInt();
        switch (days) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
         */

        /*
        // Task 9: wap to input month number and print month name
        System.out.print("Enter month number: ");
        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid monthNumber");
        }
        // Output:
//        Enter month number: 5
//        May
         */

        /*
//        Task 10: write a program to count total number of notes in given amount
        System.out.println("Enter the amount: ");
        long amount = sc.nextLong();
        int numOf500Notes = (int)amount/500;
        amount %= 500;
        int numOf100Notes = (int)amount/100;
        amount %= 100;
        int numOf50Notes = (int)amount/50;
        amount %= 50;
        int numOf20Notes = (int)amount/20;
        amount %= 20;
        int numOf10Notes = (int)amount/10;
        amount %= 10;
        int numOf5Notes = (int)amount/5;
        amount %= 5;
        int numOf2Notes = (int)amount/2;
        amount %= 2;
        int numOf1Notes = (int)amount;

        System.out.println("Total number of notes: ");
        System.out.println(500 + " = " + numOf500Notes);
        System.out.println(100 + " = " + numOf100Notes);
        System.out.println(50 + " = " + numOf50Notes);
        System.out.println(20 + " = " + numOf20Notes);
        System.out.println(10+ " = " + numOf10Notes);
        System.out.println(5 + " = " + numOf5Notes);
        System.out.println(2 + " = " + numOf2Notes);
        System.out.println(1 + " = " + numOf1Notes);

        // Output:
//        Enter the amount:
//        158388
//        Total number of notes:
//        500 = 316
//        100 = 3
//        50 = 1
//        20 = 1
//        10 = 1
//        5 = 1
//        2 = 1
//        1 = 1
*/
        sc.close();
    }
}
