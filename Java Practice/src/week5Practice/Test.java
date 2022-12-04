package week5Practice;


import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        System.out.println("Welcome to the Cydeo car insurance!");

        //WRITE YOUR CODE BELOW
        Scanner scan=new Scanner(System.in);

        double cost=0;

        System.out.println("Enter your full name");
        String name=scan.nextLine();
        String firstName=name.substring(0,1).toUpperCase()+name.substring(1,name.indexOf(" "));
        String firstLast=name.substring(name.indexOf(" ")+1,name.indexOf(" ")+2).toUpperCase();
        String lastName=firstLast+name.substring(name.indexOf(" ")+2);
        System.out.println("Do you have a US driver license?");
        String license=scan.next();
        license=license.toLowerCase();
        if(license.equals("no")){
            System.out.print("You must have a license to get insurance!");
            System.exit(0);
        }else{
            System.out.println("Enter your zip code");
            String zipCode=scan.next();
            if(zipCode.equals("20910")||zipCode.equals("20740")){
                cost+=60;
                System.out.println(cost);
            }else if(zipCode.equals("22102")||zipCode.equals("22103")){
                cost+=30;
                System.out.println(cost);
            }else{
                cost+=50;
                System.out.println(cost);
            }
            System.out.println("Is this vehicle owned, financed, or leased?");
            String property=scan.next();
            property=property.toLowerCase();
            switch(property){
                case "owned":
                    cost+=10;
                    System.out.println("cost = " + cost);
                    break;
                case "financed":
                    cost+=15;
                    System.out.println("cost = " + cost);
                    break;
                case "leased":
                    cost+=20;
                    System.out.println("cost = " + cost);
                    break;
            }
            System.out.println("How is this vehicle primarily used?");
            String usage=scan.next();
            usage=usage.toLowerCase();
            switch(usage){
                case "business":
                    cost+=50;
                    System.out.println("cost = " + cost);
                    break;
                case "pleasure":
                    cost+=10;
                    System.out.println("cost = " + cost);
                    break;
                case "commuting":
                    cost+=20;
                    System.out.println("cost = " + cost);
                    System.out.println("How many days do you commute?");
                    int commuteDays=scan.nextInt();
                    cost=cost+(commuteDays*5);
                    System.out.println("cost = " + cost);
            }
            System.out.println("How old are you?");
            int age=scan.nextInt();
            if(age<16){
                System.out.print("You can't be driving");
                System.exit(0);
            }else if(age>=16&&age<20){
                cost*=10;
                System.out.println("cost = " + cost);
            }else if(age>=20&&age<25){
                cost*=6;
                System.out.println("cost = " + cost);
            }else{
                cost*=2;
                System.out.println("cost = " + cost);
            }
            System.out.println("Have you had any accidents in the last 5 years?");
            String accidents=scan.next();
            accidents=accidents.toLowerCase();
            if(accidents.equals("yes")){
                System.out.println("How many?");
                int howMany=scan.nextInt();
                cost=cost+(howMany*10);
                System.out.println("cost = " + cost);
            }
            System.out.println("What is the highest level of education you have completed?");
            String education=scan.next();
            education=education.toLowerCase();
            switch (education){
                case "bachelors":
                    cost=cost-(cost*0.05);
                    System.out.println("cost = " + cost);
                    break;
                case "masters":
                    cost= cost-(cost*0.05);
                    System.out.println("cost = " + cost);
                    break;
                case "phd":
                    cost= cost-(cost*0.10);
                    System.out.println("cost = " + cost);
                    break;
                case "high school":
                    cost=cost+(cost*0.05);
                    System.out.println("cost = " + cost);
                    break;
            }
            String reference=firstName.substring(0,2).toUpperCase()+age+lastName.substring(lastName.length()-3,lastName.length()).toUpperCase()+zipCode+education.toUpperCase();

            System.out.println(firstName+" " +lastName+ ", here's your quote!\nThis is your start premium cost: $"+cost+"\nThis is your reference number: "+reference.toUpperCase());





        }








    }
}
