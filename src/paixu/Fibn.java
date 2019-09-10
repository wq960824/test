package paixu;

public class Fibn {
    public int Fibonacci(int n) {
        //动态规划就是把需要的 值给储存起来方便下次下次调用的时候使用
        if (n <= 1)
            return n;
        int pre2 = 0, pre1 = 1;
        int fib = 0;
        for (int i = 2; i <= n; i++) {
            fib = pre2 + pre1;
            pre2 = pre1;
            pre1 = fib;
        }
        return fib;
    }

}
