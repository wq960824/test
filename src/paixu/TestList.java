package paixu;

import com.alibaba.fastjson.JSON;

import java.util.*;

public class TestList {
    public static void main(String args[]){
        List list = new ArrayList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(11);
        System.out.println(list);

        Set set = new HashSet();
        List newList = new ArrayList();
        set.addAll(list);
        newList.addAll(set);
        System.out.println(newList);

        People p=new People();
        p.setName("李四");
        p.setPhoneNumber("110");
        People p1=new People();
        p1.setName("李四");
        p1.setPhoneNumber("110");

        List<People> listPeople = new ArrayList<People>();
        listPeople.add(p);
        listPeople.add(p1);
        Set<People> set1=new HashSet<People>();
        set1.addAll(listPeople);
        System.out.println(JSON.toJSONString(listPeople));
        System.out.println(JSON.toJSONString(set1));
    }
}

