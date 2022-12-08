package day36_PracticeTasks.MobileAppTask;

public class Discord extends MobileApp{

    public Discord(String name, String version) {
        super(name, version);
    }

    public void chat(String name){
        System.out.println(name+" is chatting on "+ this.name);
    }
}
