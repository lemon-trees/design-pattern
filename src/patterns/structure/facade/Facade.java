package patterns.structure.facade;

public class Facade {

    private SubSystem subSystem = new SubSystem();

    public void watchMovie(){
        subSystem.turnOnTv();
        subSystem.setCD("终结者");
        subSystem.startWatching();
    }

}
