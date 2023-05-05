import java.util.Scanner;
public class Dividemulti {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your no");
        a=sc.nextInt();
        int b;
        System.out.println("Enter Your value");
        b=sc.nextInt();
        int mul=1;
        while(a<=b){
            if(a%3==0){
                mul=mul*a;
                System.out.printf("the multiple of 3 is %d",mul);
            }
            a++;
        }
    }
}
