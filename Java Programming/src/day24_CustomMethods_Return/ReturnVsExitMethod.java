package day24_CustomMethods_Return;

public class ReturnVsExitMethod {

    public static void main(String[] args) {

        nameOfTheMonth(50);
        System.out.println("Hello World");//this will be printed only if you use the return statement



    }
    public static void nameOfTheMonth(int number){
        if(number<1||number>12){
            System.out.println("Invalid number");
            //return;//exists the method, remaining code fragments never get executed
            System.exit(0);//exits the entire system(all of the methods)
        }else{
            switch (number) {
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
    }
