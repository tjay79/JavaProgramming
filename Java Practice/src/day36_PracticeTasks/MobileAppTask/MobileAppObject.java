package day36_PracticeTasks.MobileAppTask;

public class MobileAppObject {

    public static void main(String[] args) {

        Instagram insta1= new Instagram("Instagram", "V.11.1");

        insta1.useTheApp(12);
        insta1.postPhotos();
        insta1.download();

        Discord discord1 = new Discord("Discord", "V.12.3");

        discord1.useTheApp(35);
        discord1.download();
        discord1.chat("Alex");

        System.out.println(insta1);
        System.out.println(discord1);







    }
}
