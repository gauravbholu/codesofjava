import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your no.");
        a=sc.nextInt();
        int i=1;
        while(i<=10){
            System.out.printf("table of %d * %d is %d\n",a,i,a*i);
            i++;
        }
    }
}
