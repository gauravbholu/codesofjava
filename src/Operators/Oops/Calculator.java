package Operators.Oops;

public class  Calculator {
    static double pi=3.14;
    double Circlearea(int radius){
        return pi*(radius*radius);
    }

    public static void main(String[] args) {
        Calculator c= new Calculator();
        int r=5;
        System.out.println("Area Of Circle:"+c.Circlearea(r));
    }

}


