package paixu;

import java.util.Arrays;

public class Number {
    public int NumberOf1(int n) {
        int cnt = 0;
        while (n != 0) {
            cnt++;
            n &= (n - 1);
        }
        return cnt;
    }
    //�ж��Ƿ�����������ƽ����
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);
        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            } else if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
    //g�����ʾ�Լ�����������s�����ʾ���ܷ����    �޶�һ����ֻ�ܵõ�һ�������
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gi = 0, si = 0;
        while (gi < g.length && si < s.length) {
            if (g[gi] <= s[si]) {
                gi++;
            }
            si++;
        }
        return gi;
    }
    //�ж�s�Ƿ������t����
    public boolean isSubsequence(String s, String t) {
        int index = -1;
        for (char c : s.toCharArray()) {
            index = t.indexOf(c, index + 1);
            if (index == -1) {
                return false;
            }
        }
        return true;
    }

    public long gec(long m,long n){
        while (n!=0){
            long rem=m%n;
            m=n;
            n=rem;
        }
        return m;
    }
}
