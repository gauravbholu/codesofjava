//Q/no-4;
 package Operators.Oops;

 class Car {
    int make;
    String model;
    int year;

    public  void DetailsOfCar(String model,int make,int year) {
        System.out.println("Car Model is :" +model+ "Make :"+make+ " Year :"+year);
    }

     public static void main(String[] args) {
         Car Porsche=new Car();
         Car Bentley=new Car();
         Car DC=new Car();
         Porsche.DetailsOfCar("Porsche ",2016,2016);
         Bentley.DetailsOfCar("Bentley ",2022,2022);
         DC.DetailsOfCar("DC Avanti ",2023,2023);
     }
}
