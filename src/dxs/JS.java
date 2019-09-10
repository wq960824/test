package dxs;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class JS {
    public static void main(String args[]) {
        JS js = new JS();
        js.sxh();
        js.hxdb(2, 1, 9);
        js.dsj(7);
        js.nin();
        js.fshsh(1, 6, 4);
        int a = 1, b = 2;
        js.swap(a, b);
        System.out.println(a);//在java中所有的传参都是值传递，例如互换a和b的内容可以写个实体类传入改变实体类
        P p = new P();
        p.setA(a);
        p.setB(b);
        System.out.println(JSON.toJSONString(p));
        js.change(p);
        System.out.println(JSON.toJSONString(p));
        js.cf(27);

    }

    public void jttl(int n, int m) {
        int t = (4 * n - m) / 2;
        int j = n - t;

    }

    public void sxh() {
        String Q = "水仙花数是: ";
        for (int i = 100; i <= 999; i++) {
            String S = Integer.valueOf(i).toString();
            BigDecimal a = new BigDecimal(String.valueOf(S.charAt(0)));
            BigDecimal b = new BigDecimal(String.valueOf(S.charAt(1)));
            BigDecimal c = new BigDecimal(String.valueOf(S.charAt(2)));
            BigDecimal s = new BigDecimal(S);
            BigDecimal e = a.pow(3).add(b.pow(3)).add(c.pow(3));
            if (s.compareTo(e) == 0) {
                Q = Q + S + " ,";
            }
        }
        System.out.println(Q.substring(0, Q.length() - 1));
    }

    public void hxdb(int a, int b, int c) {
        if (a >= 3 || b >= 5 || c >= 7 || a < 0 || b < 0 || c < 0) {
            System.out.println("erro");
        } else {
            for (int i = 10; i <= 100; i++) {
                if (i % 3 == a && i % 5 == b && i % 7 == c) {
                    System.out.println(i);
                    return;
                }
            }
            System.out.println("no answer");
        }
    }

    public void dsj(int n) {
        if (n <= 20) {
            int m = n * 2 - 1;
            for (int i = n; i > 0; i--) {
                int x = i * 2 - 1;
                int w = (m - x) / 2;
                for (int j = 1; j <= w; j++) {
                    System.out.print(" ");
                }
                for (int z = 1; z <= x; z++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            System.out.println("err");
        }
    }

    public void nin() {
        for (int i = 192; i <= 329; i++) {
            int a = i * 2;
            int b = i * 3;
            String s = i + "" + a + "" + b;
            boolean b1 = true;
            for (int j = 1; j <= 9; j++) {
                Boolean bo = s.contains(Integer.valueOf(j).toString());
                if (!bo) {
                    b1 = false;
                    break;
                }
            }
            if (b1) {
                System.out.println(i);
                System.out.println(a);
                System.out.println(b);
                System.out.println("********************************************************");

            }

        }
    }

    public void fshsh(int a, int b, int c) {
        if (b == 0) {
            System.out.println("err");
            return;
        }
        System.out.println(new BigDecimal(String.valueOf(a)).divide(new BigDecimal(String.valueOf(b)), c, BigDecimal.ROUND_HALF_UP));
    }

    public void swap(int a, int b) {
        int t;
        t = a;
        a = b;
        b = t;

    }

    public void change(P p) {
        int t = p.getA();
        p.setA(p.getB());
        p.setB(t);
    }

    public void cf(int n) {
        if (n >= 2 && n <= 79) {
            for (int i = 1023; i <= 49876; i++) {
                if (String.valueOf(i).length() == 4) {
                    //下面逻辑没有大问题但是具体逻辑需要修改 多点if判断而已
                    BigDecimal a = new BigDecimal(String.valueOf(i));
                    BigDecimal b = a.multiply(new BigDecimal(n));
                    if (b.toString().length() == 5) {
                        if (a.toString().contains("0")) {
                            String s = a.toString() + b.toString();
                            Boolean aBoolean = this.getTONG(s);
                            if (aBoolean) {
                                System.out.println("a:" + a + "  b:" + b);
                            }
                        } else {
                            String s = "0" + a.toString() + b.toString();
                            Boolean aBoolean = this.getTONG(s);
                            if (aBoolean) {
                                System.out.println("a:" + a + "  b:" + b);
                            }
                        }

                    }

                } else {
                    BigDecimal a = new BigDecimal(String.valueOf(i));
                    BigDecimal b = a.multiply(new BigDecimal(n));
                    if (b.toString().length() == 5) {
                        String s = a.toString() + b.toString();
                        for (int j = 0; j <= 9; j++) {
                            Boolean bo = s.contains(String.valueOf(j));
                            if (!bo) {

                                break;
                            }
                            if (j == 9) {
                                System.out.println("a:" + a + "  b:" + b);
                            }
                        }

                    }

                }
            }
        } else {
            System.out.println("err");
        }
    }

    public boolean getTONG(String S) {
        int o = S.length();
        List list = new ArrayList();
        for (int i = 0; i < o; i++) {
            if (!list.contains(S.charAt(i))) {
                list.add(S.charAt(i));
            }

        }
        if (list.size() == o) {
            return true;
        } else {
            return false;
        }

    }
}
