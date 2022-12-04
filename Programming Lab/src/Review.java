import java.util.ArrayList;
import java.util.Arrays;

public class Review {

    public static void main(String[] args) {


        int number=23;

        Integer num=number;
        ArrayList<Integer> n1= new ArrayList<>();
        System.out.println(n1);
        n1.add(35);
        n1.add(num);
        n1.set(0,67);
        n1.add(33);
        n1.add(20);
        n1.size();
        n1.remove(0);
        n1.remove(Integer.valueOf(33));
        n1.addAll(Arrays.asList(26, 2, 6,6, 10, 54, 10, 49, 54, 56));

        ArrayList<Integer> unique= new ArrayList<>();

        for (Integer each : n1) {
            if(n1.indexOf(each)==n1.lastIndexOf(each)){
                unique.add(each);
            }

        }
        System.out.println(n1);
        System.out.println(unique);

        System.out.println("______________________________________________");

        System.out.println(n1.contains(53));

        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();

        arr1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        arr2.addAll(Arrays.asList(1, 2, 3, 4, 6, 5));

        boolean isEqual= arr1.equals(arr2);
        System.out.println(isEqual);


        System.out.println(arr1.isEmpty());



        System.out.println(arr1);

        arr1.removeIf(p->p%2==1);

        System.out.println(arr1);










    }
}
