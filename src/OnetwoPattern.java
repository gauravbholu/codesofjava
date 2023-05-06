import java.util.Scanner;
public class OnetwoPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your no");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }
}
