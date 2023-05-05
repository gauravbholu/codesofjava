import java.util.Scanner;
public class Addeven {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your No ");
        a=sc.nextInt();
        int b;
        System.out.println("Enter Your No ");
        b=sc.nextInt();
        int sum=0;
        while(a<=b){
            if(a%2==0){
                sum=sum+a;
                System.out.printf("the sum of even no is %d",sum);
            }
            a++;
        }
    }
}
