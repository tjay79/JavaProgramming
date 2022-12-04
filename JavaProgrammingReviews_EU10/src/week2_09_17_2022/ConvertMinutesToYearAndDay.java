package week2_09_17_2022;

public class ConvertMinutesToYearAndDay {

    public static void main(String[] args) {

        int minutes = 3456789;

        int remainderMinutesYear = minutes% (24*60*365);
        int minutesRemainder = remainderMinutesYear/1440;


        int year = minutes/(24*60*365);

        System.out.println("remainderMinutesYear = " + remainderMinutesYear);
        System.out.println("minutesRemainder = " + minutesRemainder);


        System.out.println(minutes + " minutes is approximately " + year + " years and " + minutesRemainder + " days");


    }
}
