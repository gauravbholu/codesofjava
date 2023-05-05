import java.util.Scanner;
public class Twoinitials {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Initial");
        char g;
        g=sc.nextLine().charAt(0);
        System.out.println("Enter Your Initial");
        char a;
        a=sc.nextLine().charAt(0);
        System.out.println("Enter Your No.");
        int b;
        b=sc.nextInt();
        System.out.println("Enter Your No.");
        int n;
        n=sc.nextInt();
        if(b>n){
            System.out.printf(" %d is greater",b);
        }
        else if(n>b){
            System.out.printf("%d is greater",n);
        }
        else{
            System.out.printf("%d || %d is smaller",b,n);
        }
    }
}
