import java.util.Scanner;
public class Celcius {
    public static void main(String[] args) {
        float celcius,fahrenhite;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the celcius value=");
         celcius=sc.nextFloat();
      fahrenhite=((celcius*9/5)+32);
        System.out.printf("temperature in fahrenhite is %f",fahrenhite);
    }
}
