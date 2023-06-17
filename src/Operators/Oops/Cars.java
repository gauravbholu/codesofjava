package Operators.Oops;

public class Cars {
    private String Model;
    private int year;

    public void setModel(String Model){
        this.Model=Model;
    }
    public void setYear(int year){
        this.year= year;
    }
    public String getModel(){
        return Model;
    }
    public int getYear(){
        return year;
    }

    public static void main(String[] args) {
        Cars c1 = new Cars();
        c1.setModel("Audi A8");
        c1.setYear(2023);
        System.out.println(c1.getModel());
        System.out.println(c1.getYear());
    }

}
