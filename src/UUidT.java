import domain.People;

import java.math.BigDecimal;

public class UUidT {
    public static void main(String[] args) {
        /*for(int i=0;i<10;i++){
            String uuid = UUID.randomUUID().toString().replaceAll("-", "");
            System.out.println(uuid);
        }*/
        BigDecimal b=new BigDecimal("3.25698").setScale(2,BigDecimal.ROUND_HALF_UP);
        System.out.println(b);
        String s="000000";
        System.out.println(s.split("0").length);
        try {
           Object O= Class.forName("domain.People").newInstance();
            People ss=(People)O;
            ss.setName("");
            System.out.println(ss.getName());
           //System.out.println(O);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
