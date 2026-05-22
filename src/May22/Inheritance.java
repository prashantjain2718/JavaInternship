package May22;
class Animal{ // parent class

    void eat(){ // method
        System.out.println("Animal eats food"); // print statement
    }
}

class Dog extends Animal{ // child class

    void bark(){ // method
        System.out.println("Dog barks"); // print statement
    }
}
public class Inheritance { // main class
    static void main() { // main method
        Dog dog = new Dog(); // object creation
        dog.eat(); // method call
        dog.bark(); // method call
    }
}
// Output:
//Animal eats food
//Dog barks
