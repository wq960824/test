package shujugeshi;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import domain.People;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Json1 {
    public static void main (String args[]){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add("e");
        People people=new People();
        people.setName(JSON.toJSONString(list));
        people.setSex("ciji");
        System.out.println(people.getName());
        Map map=new HashMap();
        map.put("name","zhangs");
        map.put("age","23");
        map.put("sex","zhangs");
        map.put("hobby","zhangs");
        String js=JSON.toJSONString(map);
        JSONObject object = (JSONObject) JSONObject.parse(js);
        System.out.println( object.get("sex"));
        String pjs=JSON.toJSONString(people);
        System.out.println(pjs);
        JSONObject OB=(JSONObject) JSONObject.parse(pjs);
        System.out.println(OB.get("name"));
        JSONObject person=new JSONObject();
        JSONArray phone=new JSONArray();
        phone.add("123131");
        phone.add("1111111");
        person.put("phone",phone);
        person.put("name","ÄãºÃ");
        JSONObject address=new JSONObject();
        address.put("country", "china");
        address.put("province", "jiangsu");
        person.put("address",address);
        person.put("bool",false);
        System.out.println(JSON.toJSONString(person));
        System.out.println(person.getJSONObject("address").get("province"));


    }
}
