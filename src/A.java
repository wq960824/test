import java.util.ArrayList;
import java.util.List;

public class A {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("1");
        list.add("");
        list.add("");
        list.add("");
        list.add("2");
        list.add("");
        System.out.println(list);
        String replace=list.toString().replace("[","").replace("]","").trim().replace(" ","");
        System.out.println(replace);

        while (String.valueOf(replace.charAt(replace.length()-1)).equals(",")){
            replace=replace.substring(0,replace.length()-1);
        }
        System.out.println(replace);
        String s=replace.replace(",,",",");
        while (s.indexOf(",,")!=-1){
            s=s.replace(",,",",");
        }

        System.out.println(s);
    }
}