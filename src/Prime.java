import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        int a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value");
        a = obj.nextInt();
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime no.");
        } else {
            System.out.println("Not Prime no.");
        }

    }
}
