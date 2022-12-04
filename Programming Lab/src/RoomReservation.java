import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int total=0;
        System.out.println("What type of room do you want?");
        String room=scan.nextLine();
        room=room.toLowerCase();
        while(!(room.equals("king bed")||room.equals("queen bed")||room.equals("single bed"))){
            System.out.println("Incorrect entry, please re-enter. What type of room do you want?");
            room=scan.nextLine();
            room=room.toLowerCase();
        }
        if(room.equals("king bed")){
            total+=120;
        }else if (room.equals("queen bed")){
            total+=100;
        }else{
            total+=80;
        }
        System.out.println("How many nights would you like to stay?");
        int nights=scan.nextInt();
        total=total*nights;

        System.out.println("Would you like to reserve another room?");
        String another=scan.next();
        another=another.toLowerCase();

        while(!(another.equals("no")||another.equals("yes"))){
            System.out.println("Incorrect entry, please re-enter. Would you like to reserve another room");
            another=scan.next();
        }
        if(another.equals("yes")){
            System.out.println("Your first room total is: $"+total);
            total=0;
            System.out.println("What type of room do you want?");
            scan.nextLine();
            room=scan.nextLine();
            room=room.toLowerCase();
            while(!(room.equals("king bed")||room.equals("queen bed")||room.equals("single bed"))){
                System.out.println("Incorrect entry, please re-enter. What type of room do you want?");
                room=scan.nextLine();
                room=room.toLowerCase();
            }
            if(room.equals("king bed")){
                total+=120;
            }else if (room.equals("queen bed")){
                total+=100;
            }else{
                total+=80;
            }
            System.out.println("How many nights would you like to stay?");
            nights=scan.nextInt();
            total=total*nights;
            System.out.println("Your total is: $"+total);

        }else{
            System.out.println("Your total is: $" + total);
        }
        scan.close();




    }
}
/*
Create a class called RoomReservation, write a program for the room
reservation:
King Bed ==> 120$
Queen Bed ==> 100$
single Bed ==> 80$
the program asks the user which bedroom does he/she wants to
reserve, and how many nights he/she is staying.
Then Ask the user "would you like to reserve another room?""
if yes ==> repeat the entire steps
if no ==> return the  total price
If user enters any invalid entry,  ask the user to re-
enter until user provides a valid entry
 */
