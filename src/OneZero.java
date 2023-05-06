import java.util.Scanner;
public class OneZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your no");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.printf("1");
                }
                else {
                    System.out.printf("0");
                }


            }
            System.out.println();

        }
    }
}
