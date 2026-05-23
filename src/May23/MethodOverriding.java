package May23;
class Animal{
    void sound(){
        System.out.println("Animal make sounds");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class MethodOverriding {
    static void main() {
        Animal a = new Dog(); // upcasting
        Dog dog = (Dog)a; // downncasting

        dog.sound();
    }
}