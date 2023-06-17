package Operators.Oops;

public class Rectangles {
    private double length;
    private double width;
    double area(double length,double width){
        return length*width;
    }

    public static void main(String[] args) {
        Rectangles r = new Rectangles();
        r.length=5;
        r.width=10;
        System.out.println("Area Of Rectangle is :" +r.area(r.length,r.width));
    }

}
