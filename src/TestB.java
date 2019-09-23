import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestB {
    public static void main(String args[]){
       /* List list=new ArrayList();
        if (CollectionUtils.isEmpty(list)){
            System.out.println("1");
        }*/
        String key="sd";
        int h;
        int a=1;
        System.out.println((key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16));
        System.out.println(a>>>16);
        System.out.println((a>18)? true:false);
        System.out.println(null!=null);
        List list=new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        Iterator iterable=list.iterator();
        while (iterable.hasNext()){
            list.remove(iterable.next());
            System.out.println(iterable.next());//无论是foreach还是迭代器都不能再循环中删除元素，尽量采用FOR循环通过变量控制
        }


    }

    public static  int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
    
}
