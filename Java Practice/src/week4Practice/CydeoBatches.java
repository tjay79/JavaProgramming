package week4Practice;

public class CydeoBatches {

    public static void main(String[] args) {

        String batchType = "Er";
        String hours = "";
        boolean courses = batchType=="US morning" || batchType=="US evening" || batchType=="EU";

        if (courses) {


            switch (batchType) {

                case "US morning":
                    hours = "Class times are 10-5 EST. M, T, Th. F.";
                    break;

                case "US evening":
                    hours = "Class times are 7-10 EST. M, T, W, Th, S, Su.";
                    break;

                default:
                    hours = "Class times are 10-5 EST. M, T, W, Th, F.";




            }

            System.out.println(hours);

        }else{
            System.out.println("Invalid batch");
        }




    }
}
/*
Create a class named Cydeo batches. In Cydeo we have three batch
types: US morning, US evening, EU.
Depending on a batch type (String) print information about the
batch.
If batch type is US morning ==> print "Class times are
10-5 EST. M, T, Th, F."
If batch type is US evening ==> print "Class times are 7-
10 EST. M, T, W, Th, S, S"
If batch type is EU ==> print "Class times are  10-5 EST.
M, T, W, Th, F."
If batch type is invalid, print "Invalid Btach"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
 */