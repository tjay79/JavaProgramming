package day_05Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Jimmy";
        String lastName = "King";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        double salary = 100000.58;

        System.out.println("Full name of the person is " + fullName + ".");
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + " and " + fullName + "´s salary is $" + salary + ".");
        ;



    }
}
