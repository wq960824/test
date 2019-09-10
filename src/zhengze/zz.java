package zhengze;

import java.util.regex.Pattern;

public class zz {
    private final static Pattern Regex_QQ = Pattern.compile("[0-9]{5,10}");
    private final static Pattern mobile=Pattern.compile("^1[3|4|5|7|8][0-9]{9}$");
    public static void main(String args[]){
        String s="13173665524";
        if (Regex_QQ.matcher(s).matches()){
            System.out.println("ÕýÈ·");
        }else {
            System.out.println("´íÎó");
        }
        if (mobile.matcher(s).matches()){
            System.out.println("1");
        }else {
            System.out.println("2");
        }

    }
}
