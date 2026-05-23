package May13;

import java.util.Scanner;

public class Student {
    int id;
    String name;
    char grade;
    float fees;
    String address;

    static void main() {
        Student st = new Student();
        st.input();
        st.display();
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        id = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();
        System.out.print("Enter Grade: ");
        grade = sc.next().charAt(0);
        System.out.print("Enter Fees: ");
        fees = sc.nextFloat();
        System.out.print("Enter Address: ");
        sc.nextLine(); // This consumes the leftover newline character (\n) from hitting Enter after the fees
        address = sc.nextLine();
        sc.close();
    }

    void display() {
        System.out.println("Student Id: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student grade: " + grade);
        System.out.println("Student fees: " + fees);
        System.out.println("Student Address: " + address);
    }
}
