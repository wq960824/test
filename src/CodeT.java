import java.math.BigDecimal;


public class CodeT {
    public static void main(String args[]) {
        double d = Math.random();
        BigDecimal P=new BigDecimal(d).multiply(new BigDecimal(1000000));
        String p=P.toString().substring(0,6);
        BigDecimal P1=new BigDecimal(p);
        double d1=Math.random();
        BigDecimal Q=new BigDecimal(d1).multiply(new BigDecimal(100));
        String q=Q.toString().substring(0,2);
        BigDecimal Q1=new BigDecimal(q);
        BigDecimal G=P1.divideAndRemainder(Q1)[1];
        System.out.println(G);





    }
}

