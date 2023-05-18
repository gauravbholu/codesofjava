import java.util.Scanner;
public class GreatestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your No :");
        int a = sc.nextInt();
        System.out.println("Enter Your Second No :");
        int b = sc.nextInt();
        System.out.println("Enter Your Third No :");
        int c = sc.nextInt();
        if (a > b) {
            if(a >c){
                System.out.println("Greatest is a");
            }
            else{
                System.out.println("Greatest is c");
            }
        }
        else{
            if(b > c){
                System.out.println("Greatest is b");
            }
            else{
                System.out.println("Greatest is c");
            }
        }
    }
}
