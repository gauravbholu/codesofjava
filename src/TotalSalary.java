import java.util.Scanner;
public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Salary");
        int salary=sc.nextInt();
        System.out.println("Enter Your Allowances");
        int allowances=sc.nextInt();
        System.out.println("Enter Your Deductions");
        int deductions=sc.nextInt();
       int totalsalary;
       totalsalary=salary-allowances-deductions;
        System.out.printf("%d",totalsalary);

    }
}
