import java.util.*;

interface car {
    public void func();
}

class ElectricCar implements car {
    public void func() {
        System.out.println("Electric Car");
    }
}

public class Interface {
    public static void main(String[] args) {
        car c1 = new ElectricCar();
        c1.func();
    }
}
