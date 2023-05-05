import java.util.Scanner;
public class Add {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        int r=0;
        int i=1;
        while(i<=a){
            r=r+i;
            System.out.printf("The result is %d",+r," ");
            i=i+1;
        }
    }
}
