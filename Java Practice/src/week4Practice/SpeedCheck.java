package week4Practice;

import java.util.Scanner;

public class SpeedCheck {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current speed");
        int currentSpeed = scan.nextInt();
        int speedLimit = 55;

        int difference = currentSpeed - speedLimit;
        String message = "";

        message = (currentSpeed > speedLimit)? "You're driving " + difference + " mph over the limit. Slow down!" : "";

        System.out.println(message);

        scan.close();


    }
}
/*
Write a program for the speed check. a variable named speedLimit is
given and assigned, ask user to enter the current speed, if the
current speed is over the speedLimit print slow down, otherwise do not
print anything
Ex:
speedLimit = 55;
Enter current speed:
105
output:
You're driving 50 mph over the limit. Slow down!
 */