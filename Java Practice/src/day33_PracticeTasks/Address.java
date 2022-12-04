package day33_PracticeTasks;

public class Address {

    public String street;
    public String city;
    public String state;
    public String zipCode;
    public static String country="U.S.A.";
    public static String planet="Earth";

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String toString() {
        return "Address{" + street + "\n"+ city+" "+state+", "+zipCode+
                '}';
    }
}
/*
Address Task:
1. Create a class named Address:
    Attributes:
        instance:  street, city, state, zipCode;
        static: country, planet
        Add a constructor that can set All the fields
(instances)
    Actions
            setInfo: sets all the instances
            toString: returns the address
                        EX:

7925 Jones Branch Dr

McLean Va, 22012
 */
