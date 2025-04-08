import java.util.*;
class sum{
    static int s(int n1,int n2){
        return n1+n2;
    }
    static double s(double n1,double n2){
        return n1+n2;
    }
    static int s(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    static double s(double n1,double n2,double n3){
        return n1+n2+n3;
    }

}

public class MethodOverloading{
public static void main(String[] args){
    System.out.println(sum.s(4,5));
    System.out.println(sum.s(4,5,7));
    System.out.println(sum.s(4.6,5.8));
    System.out.println(sum.s(4.6,5.8,9.3));
  }
}