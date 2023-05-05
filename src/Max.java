import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        a=sc.nextInt();
        int b;
        System.out.println("Enter your no");
        b=sc.nextInt();
        if(a>b){
            System.out.printf("Maximum no is %d",a);
        }
        else{
            System.out.printf("Minimum no is %d",a);
        }
        }
    }

