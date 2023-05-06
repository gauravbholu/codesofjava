import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
        int n=sc.nextInt();
        int a=1;
        int b=1;
        int sum=0;
        for(int i=1;i<=n-2;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.printf("fibonacci of %d is %d",n,sum);
    }
}
