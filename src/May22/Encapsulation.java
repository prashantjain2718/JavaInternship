package May22;

public class Encapsulation {// class
    private String name;
    private int age;


    // getter method
    public String getName() {
        return name;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main() {
        Encapsulation student = new Encapsulation(); // object creation
        // setter
        student.setName("Prashant");
        student.setAge(21);
        // getter
        System.out.println("The name of student is: " + student.getName());
        System.out.println("The age of student is: " + student.getAge());
    }
}