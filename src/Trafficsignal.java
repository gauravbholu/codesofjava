import java.util.Scanner;
public class Trafficsignal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char signal;
        System.out.println("Enter your signal");
        signal=sc.nextLine().charAt(0);
        switch (signal){
            case 'r':
            case 'R':
                System.out.println("STOP");
                break;
            case 'y':
            case 'Y':
                System.out.println("READY");
                break;
            case 'g':
            case 'G':
                System.out.println("GO");
                break;
            default:
                System.out.println("please enter valid signal");
        }
    }
}
