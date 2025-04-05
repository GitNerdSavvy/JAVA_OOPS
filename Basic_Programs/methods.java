class Dog {
    String name;
    int age;

    public void eat() {
        System.out.print(name + " eats");
    }
}

public class methods {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Bruno";
        d1.eat();
    }
}
