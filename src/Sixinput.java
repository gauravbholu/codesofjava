import java.util.Scanner;
public class Sixinput {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        a=sc.nextInt();
        int b;
        System.out.println("Enter your value");
        b=sc.nextInt();
        System.out.printf("the result of %d and %d is %d\n",a,b,a+b);
        System.out.printf("the result of %d and %d is %d\n",a,b,a-b);
        System.out.printf("the result of %d and %d is %d\n",a,b,a*b);
        System.out.printf("the result of %d and %d is %d\n",a,b,a/b);

        float c;
        System.out.println("Enter your value");
        c=sc.nextFloat();
        float d;
        System.out.println("Enter your value");
        d=sc.nextFloat();
        System.out.printf("the result of %f and %f is %f\n",c,d,c+d);
        System.out.printf("the result of %f and %f is %f\n",c,d,c-d);
        System.out.printf("the result of %f and %f is %f\n",c,d,c*d);
        System.out.printf("the result of %f and %f is %f\n",c,d,c/d);

        long e;
        System.out.println("Enter your value");
        e=sc.nextLong();
        long f;
        System.out.println("Enter your value");
        f=sc.nextLong();
        System.out.printf("the result is %ld and %ld is %ld\n",e,f,e+f);
        System.out.printf("the result is %ld and %ld is %ld\n",e,f,e-f);
        System.out.printf("the result is %ld and %ld is %ld\n",e,f,e*f);
        System.out.printf("the result is %ld and %ld is %ld\n",e,f,e/f);
    }
}
