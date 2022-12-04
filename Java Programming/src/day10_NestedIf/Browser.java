package day10_NestedIf;

public class Browser {

    public static void main(String[] args) {

        String browser = "IE";
        boolean valid = browser=="Chrome" || browser=="Firefox" || browser=="Opera" || browser=="Safari" || browser=="Edge" ||
                browser=="IE";


        String browserName = (valid)? (browser=="Chrome")? "Chrome browser is selected"
                :(browser =="Firefox")? "Firefox browser is selected"
                : (browser =="Opera") ? "Opera browser is selected"
                : (browser == "Safari")? "Safari browser is selected"
                : (browser=="Edge")? "Edge browser is selected"
                : "Internet explorer browser is selected"  : "Invalid browser";
        System.out.println(browserName);


    }
}
