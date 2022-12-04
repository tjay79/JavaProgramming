package day35_PracticeTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {

    public static void main(String[] args) {

        CandyTask candy1=new CandyTask("Mars", 3, 1.79,true);
        CandyTask candy2=new CandyTask("Twix", 5, 0,false);
        CandyTask candy3=new CandyTask("Reeses", 6, 1.19,true);
        CandyTask candy4=new CandyTask("Jolly Ranchers", 2, 0.99,false);
        CandyTask candy5=new CandyTask("Snickers", 3, 1.99,true);

        ArrayList<CandyTask> factory1=new ArrayList<>();

        factory1.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (CandyTask each : factory1) {
            System.out.println(each);
        }










    }



}
