import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your no");
        int a;
        a=sc.nextInt();
        System.out.println("Enter Your no");
        int b;
        b=sc.nextInt();
        System.out.println("Enter your no");
        char c;
        c=sc.nextLine().charAt(0);
        if(c=='+'){
            System.out.printf("result of %d and %d  is %d",a,b,a+b);
        }
        else if(c=='-'){
            System.out.printf("result of %d and %d  is %d",a,b,a-b);
        }
        else if(c=='*'){
            System.out.printf("result of %d and %d  is %d",a,b,a*b);
        }
        else if(c=='/'){
            System.out.printf("result of %d and %d  is %d",a,b,a/b);
        }
        else{
            System.out.printf("result of %d and %d  is %d",a,b,a%b);
        }
    }
}
