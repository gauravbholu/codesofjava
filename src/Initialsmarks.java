import java.util.Scanner;
public class Initialsmarks{
    public static void main(String[] args) {
        char a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Character");
        a=sc.nextLine().charAt(0);
        char b;
        System.out.println("Enter your character");
        b=sc.nextLine().charAt(0);
        char c;
        System.out.println("Enter Your Character");
        c=sc.nextLine().charAt(0);
        int d;
        System.out.println("Enter Your marks");
        d=sc.nextInt();
        int e;
        System.out.println("Enter your marks");
        e=sc.nextInt();
        int f;
        System.out.println("Enter your marks");
        f=sc.nextInt();
        System.out.printf("Marks of %c is %d\n",a,d);
        System.out.printf("Marks of %c is %d\n",b,e);
        System.out.printf("Marks of %c is %d\n",c,f);


    }
}
