package guanchazhe;

public class StudentObserver implements Observer {
    private TeacherSubject t;
    //学生的姓名,用来标识不同的学生对象
    private String name;
    //构造器用来注册观察者
    public StudentObserver(String name,TeacherSubject t) {
        this.name=name;
        this.t = t;
        //每新建一个学生对象,默认添加到观察者的行列
        //t.Attach(this);
    }
    @Override
    public void update(String info) {
        System.out.println(name+"得到作业:"+info);
    }
}
