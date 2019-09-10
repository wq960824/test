package guanchazhe;

import java.util.Observable;

public class Teacher extends Observable  {
    private String info;
    public void setHomework(String info) {

        this.info=info;
        System.out.println("布置的作业是"+info);

        setChanged();
        notifyObservers();
    }
    public String getInfo() {
        return info;
    }
}
