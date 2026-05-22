package May22;

public class Car {
    String color;
    int speed;

    void start(){
        System.out.println("Car color: " + color);
        System.out.println("Car speed: " + speed);
    }

    static void main() {
        Car car = new Car();
        car.color = "black";
        car.speed = 120;
        car.start();

        Car car1 = new Car();
        car1.color = "red";
        car1.speed = 125;
        car1.start();
    }
}
