package paixu;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;

public class GuiBing {
    public static void main(String args[]) {
        int arr[] = {1, 24, 13, 26};
        int brr[] = {2, 15, 27, 28};
        GuiBing guiBing = new GuiBing();
        int crr[] = guiBing.guiBing(arr, brr);
        System.out.println(JSON.toJSONString(crr));

    }
/**
 * @param arr int 数组
 * @param brr int 数组
 * @return int 数组
 * **/
    public int[] guiBing(int arr[], int brr[]) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        int a = 0;
        int b = 0;
        int crr[] = new int[arr.length + brr.length];
        /**
         * 我们首先要考虑到数组越界的事所以每次赋值完后判断是否达到数组极限，达到了就不在下标加一
         * 如果当一个数组已经全部赋值完但是另一个数组没有会产生死循环此时我们要判断这样的情况把未赋值完的数组后半部分直接在当前循环赋值 break出循环
         *
         * */
        for (int i = 0; 1 < crr.length; i++) {
            if (arr[a] <= brr[b]) {
                crr[i] = arr[a];
                if (a == arr.length - 1) {
                    int count = brr.length - b;
                    for (int c = 1; c <= count; c++) {
                        crr[i + c] = brr[b];
                        b++;
                    }
                    break;
                }
                if (a < arr.length - 1) {
                    a++;
                }
            } else {
                crr[i] = brr[b];
                if (b == brr.length - 1) {
                    int count = arr.length - a;
                    for (int c = 1; c <= count; ) {
                        crr[i + c] = arr[a];
                        a++;
                        c++;
                    }
                    break;
                }
                if (b < brr.length - 1) {
                    b++;
                }
            }
        }
        return crr;
    }
}
