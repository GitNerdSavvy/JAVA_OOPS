import java.util.*;

class sol{
    int num;
    String name;
    sol(int num){
        this.num=num;

    }
    sol(int num,String name){
        this.num=num;
        this.name=name;
    }
    public void show(){
        System.out.println("Number: "+num+" Name: "+name);
    }
}

public class ConstructorOverloading{
public static void main(String[] args){
    sol a=new sol(4,"Savvy");
    a.show();
    sol b=new sol(9);
    b.show();
  }
}