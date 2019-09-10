import java.util.LinkedList;
import java.util.List;

public class TestA {
    public static void main(String args[]){
        List<Integer> dataList = new LinkedList<Integer>();//创建一个链表
        for(int i=0;i<10;i++) //添加数据成员
            dataList.add(new Integer(i+1));
        int index=-1;
        //循环
        while(dataList.size()>1){
            index  = (index+3)%dataList.size();//以(index+k)对size()取余
            dataList.remove(index--);
        }

        System.out.println(dataList.get(0).intValue());
    }
}
