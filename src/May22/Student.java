package May22;

public class Student { // class
    // data member
    // instance variable
    String name;
    int age;

    // parameterized constructor
    Student(String n, int a){
        name = n;
        age = a;
    }
    // method
    void display(){ // instance method
        System.out.println("Student name: "+name);
        System.out.println("Student age: " + age);
    }

    static void main() {
        Student student = new Student("Prashant", 21); // heap memory
        Student student1 = new Student("Palak",21); // heap memory
        student.display();
        student1.display();

    }

}
