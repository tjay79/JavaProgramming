package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1= new Person();
      //  person1.name="Daniel";  I can´t set the name directly because the instance variable is private
        //person1.age=28;   I can´t set the age directly because the instance variable is private
        person1.setName("Daniel");
        person1.setAge(28);

        System.out.println(person1.getName()+" : "+person1.getAge());






    }
}
