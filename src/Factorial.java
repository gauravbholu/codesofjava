import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++) {
            fact = fact * i;
        }
            System.out.printf("The factorial is %d\n",fact);

    }
}
