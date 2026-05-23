package May23;

class Addition {
    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    double add(double num1, int num2, double num3) {
        return num1 + num2 + num3;
    }

}

public class MethodOverloading {
    static void main() {
        Addition a = new Addition();
        System.out.println(a.add(3, 5)); // 8
        System.out.println(a.add(3, 5, 2)); // 10
        System.out.println(a.add(3.4,5,3.5));
    }
}
