import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        a = sc.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }

}
