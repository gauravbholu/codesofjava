import java.util.Scanner;
public class Threemaxmin {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        a=sc.nextInt();
        int b;
        System.out.println("Enter your no");
        b=sc.nextInt();
        int c;
        System.out.println("Enter your no");
        c=sc.nextInt();
        if(a>b && a>c){
            System.out.printf("Maximum is %d",a);
        }
        else if(b>c){
            System.out.printf("Maximum is %d",b);
        }
        else{
            System.out.printf("Minimum is %d",a);
        }
    }
}
