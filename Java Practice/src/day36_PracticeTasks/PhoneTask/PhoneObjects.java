package day36_PracticeTasks.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone= new Iphone();
        iphone.setInfo("Apple","Iphone 14", "Large",1350);

        iphone.faceTime(1234567890l);
        iphone.faceTime("cydeo@cydeo.com");
        iphone.call(1234567890l);
        iphone.text(1234567890l);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung","Galaxy S22","Medium",990);

        samsung.call(1234567890l);
        samsung.text(1234567890l);
        samsung.freeze();

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia","3330","Small",340);

        nokia.call(1234567890l);
        nokia.text(1234567890);
        nokia.selfDefense();

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);








    }
}
