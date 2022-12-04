package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        Initials("Anthony","Arabia");
        EmailDomain("tjay79@hotmail.com");

        String[] emails={"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com","Gulsen@gmail.com"};
        for (String email : emails) {
            EmailDomain(email);
        }
        NameOfTheMonths(12);
        NameOfTheDay(3);

    }

    public static void Initials (String firstName,String lastName){

        String initial=firstName.substring(0,1)+"."+lastName.substring(0,1)+".";
        initial=initial.toUpperCase();
        System.out.println(initial);


    }
    public static void EmailDomain (String email){

        String domain=email.substring(email.indexOf('@')+1,email.lastIndexOf('.'));
        System.out.println(domain);
    }
    public static void NameOfTheMonths (int monthNumber){
        if(monthNumber<1||monthNumber>12){
                System.out.println("Invalid number");
            }else{
                switch (monthNumber) {
                    case 1:
                        System.out.println("January");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    default:
                        System.out.println("December");
                }
        }

    }
    public static void NameOfTheDay (int dayNumber){
        String days="";
        if(dayNumber<1||dayNumber>12){
            System.out.println("Invalid number");
        }else{
            days=  (dayNumber==1)?"Has 31 days":(dayNumber==2)?"Has 28 days":(dayNumber==3)?"Has 31 days":(dayNumber==4)?"Has 30 days"
                    :(dayNumber==5)?"Has 31 days":(dayNumber==6)?"Has 30 days":(dayNumber==7)?"Has 31 days":(dayNumber==8)?"Has 31 days"
                    :(dayNumber==9)?"Has 30 days":(dayNumber==10)?"Has 31 days":(dayNumber==11)?"Has 30 days":"Has 31 days";
            System.out.println(days);
        }
    }
}
