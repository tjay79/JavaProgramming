package week4Practice;

public class GradeLevel2 {

    public static void main(String[] args) {

        int grade = 5;
        String gradeLevel;

        if(grade >=1 && grade <=18){

            switch (grade){

                case 1: case 2: case 3: case 4: case 5:
                    gradeLevel="Elementary school";
                    break;

                case 6: case 7:case 8:
                    gradeLevel="Middle school";
                    break;

                case 9: case 10: case 11: case 12:
                    gradeLevel="High school";
                    break;

                case 13: case 14: case 15: case 16:
                    gradeLevel="College";
                    break;

                default:
                    gradeLevel="Grad school";




            }







        }else{
            gradeLevel="Invalid grade level given";
        }

        System.out.println(gradeLevel);


    }
}
