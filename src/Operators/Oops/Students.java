package Operators.Oops;

public class Students {
    private String name;
    private double grade;
    static int passgrade=60;
    String isPassing(double grade){
        if(grade>=passgrade)
            return "True";
        else
            return "False";

    }
    public static void main(String[] args) {
        Students s1 = new Students();
         s1.name = "Gaurav";
        s1.grade = 72.8;
        String Boy= s1.isPassing(s1.grade);
        if(Boy=="True")
            System.out.println(s1.name+" is  pass.");
        else
            System.out.println(s1.name+" is  fail.");
    }

}
