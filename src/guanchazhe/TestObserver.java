package guanchazhe;

public class TestObserver {
    public static void main(String[] args) {

        TeacherSubject teacher=new TeacherSubject();
        StudentObserver zhangSan=new StudentObserver("张三", teacher);
        StudentObserver LiSi=new StudentObserver("李四", teacher);
        StudentObserver WangWu=new StudentObserver("王五", teacher);
        teacher.Attach(zhangSan);
        teacher.Attach(LiSi);
        teacher.Attach(WangWu);
        teacher.setHomework("第二页第六题");
        teacher.setHomework("第三页第七题");
        teacher.Detach(WangWu);
        teacher.setHomework("第五页第八题");
        Teacher teacher1=new Teacher();
        Student student=new Student("学生",teacher1);
        Student student1=new Student("学生1",teacher1);
        //teacher1.setHomework("你大爷的");
        //teacher1.setHomework("你大爷的1");

    }
}
