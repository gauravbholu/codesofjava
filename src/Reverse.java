import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Value");
        a=sc.nextInt();
        int rev=0;
        int rem;
        while(a!=0){
            rem=a%10;
            rev=(rev*10)+rem;
            a=a/10;
            System.out.printf("The reverse is %d",rev);
        }
    }
}
