package day36_PracticeTasks.MobileAppTask;

public class Instagram extends MobileApp{


    public Instagram(String name, String version) {
        super(name, version);
    }
    public void postPhotos(){
        System.out.println("The photos are being posted on "+name);
    }
}
