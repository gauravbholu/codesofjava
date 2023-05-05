import java.util.Scanner;
public class Equal {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        a=sc.nextInt();
        int b;
        System.out.println("Enter your no");
        b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}
