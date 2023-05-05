import java.util.Scanner;
public class OneKtoOne {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        a=sc.nextInt();
        int i=1;
        while(a>=i){
            System.out.printf("the no is %d\n",a);
            a--;

        }

    }
}
