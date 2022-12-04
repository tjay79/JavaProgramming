package week4Practice;

public class Browser {

    public static void main(String[] args) {

        String browser = "Firevox";
        String browserType = "";

        switch (browser){

            case "Chrome":
            case "chrome":
                browserType = "Chrome is selected";
                break;

            case "Firefox":
            case "firefox":
                browserType = "Firefox is selected";
                break;

            case "Opera":
            case "opera":
                browserType = "Opera is selected";
                break;

            case "Safari":
            case "safari":
                browserType = "Safari is selected";
                break;

            case "Edge":
            case "edge":
                browserType = "Edge is selected";
                break;

            default:
                browserType = "Invalid browser";




        }

        System.out.println(browserType);


    }
}
/*
3.1  declare a String variable called browserName
3.2  Assume that the valid browsers are: chrome, firefox,
opera, safari, edge
3.3 if the browser name does not match with the valid
browsers' names, out put should be: Invalid Browser
Do Not use if statement or ternary
 */