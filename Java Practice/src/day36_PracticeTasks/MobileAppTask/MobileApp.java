package day36_PracticeTasks.MobileAppTask;

public class MobileApp {

    public String name;
    public String version;

    public MobileApp(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String toString() {
        return "MobileApp{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }

    public void useTheApp(int minutes){
        System.out.println("The app is being used for "+minutes+" minutes");
    }
    public void download(){
        System.out.println(name+" is being downloaded");
    }
}
