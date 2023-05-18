package Operators.Oops;

public class Company {
    public static class Tata {
        int NoOfEmployess;
        String HeadQuarter;
    }

    public static void main(String[] args) {
        System.out.println("Tata Motors :");
        Tata tata_motors = new Tata();
        tata_motors.NoOfEmployess= 1000;
        tata_motors.HeadQuarter = "Mumbai";
        String Domain="AutoMobile";



        System.out.println("No Of Employess : " + tata_motors.NoOfEmployess+" : "  +"HeadQuarters : "+tata_motors.HeadQuarter+ " : "+"Domain : "+Domain);


        System.out.println("TCS : ");
        Tata TCS = new Tata();
        TCS.NoOfEmployess = 2100;
        TCS.HeadQuarter = "Mumbai";
        System.out.println("No Of Employess : " + TCS.NoOfEmployess+" : "  +"HeadQuarters : "+TCS.HeadQuarter+ " : "+"Domain : "+Domain);

        System.out.println("StarBucks : ");
        Tata Starbucks = new Tata();
        Starbucks.NoOfEmployess = 150;
        Starbucks.HeadQuarter = "Banglore";
        System.out.println("No Of Employess : " + Starbucks.NoOfEmployess+" : "  +"HeadQuarters : "+Starbucks.HeadQuarter+ " : "+"Domain : "+Domain);

    }
}