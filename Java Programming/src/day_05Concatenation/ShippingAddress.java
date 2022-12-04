package day_05Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        /*
        String name = "Cydeo School",
               buildingNumber = "123B",
               ..
         */

        String name = "Anthony Arabia";
        String buildingNumber = "1";
        String streetName = "Vischeringstr.";
        String city = "Cologne";
        String state = "NRW";
        String zipCode = "51067";

        String shippingAddress = name + "\n"  + buildingNumber + " " + streetName + "\n" +  city + ", " + state + " " + zipCode;

        System.out.println(shippingAddress);





    }
}
/*
Declare the following variables:
    name
    buildingNumber
    streetName
    city
    state
    zipCode
Use concatenation to print the full shipping address
    EX:
		Jimmy Joe
		7925 Jones Branch Dr
		McLean, VA 20125
 */