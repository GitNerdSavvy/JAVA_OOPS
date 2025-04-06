import java.util.*;
class Vehicle{
    int price;
    String color;
    int mileage;
    String numberPlate;
}
class car extends Vehicle{
    String brand;
    String model;
    void fac(){
        System.out.println("The car named "+model+" of brand "+brand+ " is providing the mileage of "+mileage+" and it looks great in "+color+" color");
    }
}
public class Inheritance{
public static void main(String[] args){
    car car1=new car();
    car1.numberPlate="UP32 QR3434";
    car1.price=4500000;
    car1.model="BMW M4";
    car1.brand="BMW";
    car1.color="Gray";
    car1.mileage=4;
    car1.fac();
  }
}