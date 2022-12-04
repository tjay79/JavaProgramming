package week6Practice;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        String reserve = scan.next();
        reserve = reserve.toLowerCase();

        while (!reserve.equals("yes") && !reserve.equals("no")) {
            System.out.println("Invalid choice, please re-enter");
            reserve = scan.next();
            reserve = reserve.toLowerCase();
        }


        if (reserve.equals("yes")) {
            System.out.println("Which kind of room would you like?");
            String roomType = scan.next();
            roomType = roomType.toUpperCase();
            while (!roomType.equals("KING") || !roomType.equals("QUEEN") || !roomType.equals("SINGLE")) {

                System.err.println("Invalid room type, please re-enter");
                roomType = scan.next();
            }
              if(roomType.equals("KING")){
                System.out.println("You have selected King. Your total is $120");
            }else if(roomType.equals("QUEEN")) {
                System.out.println("You have selected Queen. Your total is $100");
            }else{
                System.out.println("You have selected Single. Your total is $80");
                }
            }else{

                System.out.println("have a nice day");
            }





        }
    }

/*
Create a class called RommReservation, write a program for the room
reservation, your program asks the user wants to reserve a room.
if user entered yes, then ask which type of room the user
wants to reserve. if user entered no, print "have a nice day"
(if user entered any invalid answer (other
than yes/no) ask user to reenter until user provides a valid entry)
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
the program should be able to display the room he/she reserved
and total price of the room.
(if the user selected an invalid room, ask the user to
reselect the room until user provides a valid entry)
 */