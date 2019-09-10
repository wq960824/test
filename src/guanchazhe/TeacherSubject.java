package guanchazhe;

import java.util.ArrayList;
import java.util.List;

public class TeacherSubject implements Subject {
    //用来存放和记录观察者
    private List<Observer> observers=new ArrayList<Observer>();
    //记录状态的字符串
    private String info;
    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        int i = observers.indexOf(observer);
        if(i>=0){
            observers.remove(observer);
        }
    }

    @Override
    public void Notify() {
        for(int i=0;i<observers.size();i++){
            Observer o=(Observer)observers.get(i);
            o.update(info);
        }
    }

    public void setHomework(String info){
        this.info=info;
        System.out.println("今天的作业是"+info);
        this.Notify();
    }

}
