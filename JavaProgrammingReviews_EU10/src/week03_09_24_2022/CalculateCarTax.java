package week03_09_24_2022;

public class CalculateCarTax {

    public static void main(String[] args) {

      double price = 78000;

      boolean firstRange = price >=20000 && price <=39999;
      boolean secondRange = price >=40000 && price <=59999;
      boolean thirdRange = price >= 60000 && price <= 80000;

      if(firstRange){
          double tax = price * 2.0/100;
          System.out.println("We have to pay $" + tax);
      }else if (secondRange) {
          double tax2 = price * 3.0/100;
          System.out.println("We have to pay $" + tax2);
      }else {
          double tax3 = price *4.0/100;
          System.out.println("We have to pay $" + tax3);
      }






    }
}
/*
Create a class which is "CalculateCarTax"
        if the price between $20000 and $39999 taxRate=0.2
        if the price between $40000 and $59999 taxRate=0.3
        if the price between $60000 and $80000 taxRate=0.4
 */