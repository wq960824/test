package danli;

public class SingleObject {
    private static SingleObject singleObject;
    private SingleObject(){};
    public static  SingleObject getInstance(){
        if (singleObject==null){
            synchronized (SingleObject.class){
                if (singleObject==null){
                    singleObject=new SingleObject();
                }
            }
        }
        return singleObject;
    }
}
