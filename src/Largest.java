import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your No");
        int a=sc.nextInt();
        System.out.println("Enter Your No");
        int b=sc.nextInt();
        System.out.println("Enter Your No");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.printf("%d is Largest",a);
        }
        else{
            System.out.printf("%d and %d is largest",b,c);
        }
    }
}
