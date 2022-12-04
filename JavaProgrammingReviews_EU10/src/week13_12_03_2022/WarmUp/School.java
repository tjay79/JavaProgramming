package week13_12_03_2022.WarmUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {

    static ArrayList<Teacher> teachers= new ArrayList<>();
    static{



        Teacher teacher1 = new Teacher("Muhtar", "ABC", 'M', LocalDate.of(1987, 1,
                1), 1l);
        Teacher teacher2 = new Teacher("Gurhan", "ABC", 'M', LocalDate.of(1977, 1,
                1), 2l);
        Teacher teacher3 = new Teacher("Aysur", "ABC", 'F', LocalDate.of(1967, 1,
                1), 3l);
        Teacher teacher4 = new Teacher("Mike", "ABC", 'M', LocalDate.of(1970, 1,
                1), 4l);
        Teacher teacher5 = new Teacher("Saim", "ABC", 'M', LocalDate.of(1989, 1,
                1), 5l);
        Teacher teacher6 = new Teacher("Asya", "ABC", 'F', LocalDate.of(1990, 1,
                1), 6l);


        teachers.addAll(Arrays.asList(teacher1,teacher2,teacher6,teacher4,teacher3,teacher5));





    }

    public static void main(String[] args) {

        System.out.println(teachers);
        ArrayList<Teacher> result=getTeacherThatStartsWith("M");

        System.out.println(result);

        ArrayList<Teacher> result1=getTeacherByGender('F');

        System.out.println(result1);



        }

    private static ArrayList<Teacher> getTeacherByGender(char gender) {

        ArrayList<Teacher> result1= new ArrayList<>();

        for (Teacher each : teachers) {

            if(each.gender==gender){

                result1.add(each);

            }

        }
        return result1;
    }

    private static ArrayList<Teacher> getTeacherThatStartsWith(String mi) {

        ArrayList<Teacher> result=new ArrayList<>();
        for (Teacher each : teachers) {
            if(each.name.startsWith(mi)){
                result.add(each);
            }
        }
        return result;
    }


}


/*
create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object


    2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a method in School class then find the teachers born in 1967 year
 */
