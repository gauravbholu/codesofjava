import java.util.Scanner;
public class Multipleof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no");
        int a=sc.nextInt();
        int sum=0;
        int rem;
        while(a!=0){
            rem=a%10;
            sum=sum+rem;
            a=a/10;
        }
        if(sum%3==0){
            System.out.println("Multiple of 3");
        }
        else{
            System.out.println("Not multiple of 3");
        }
    }
}
