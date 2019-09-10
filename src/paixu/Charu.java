package paixu;

import com.alibaba.fastjson.JSON;

public class Charu {
    public static void main(String args[]){

        int arr[]={1,4,5,32,2,53,13,4,98};
        Charu charu=new Charu();
        int brr[]=charu.chaRu(arr);
        System.out.println(JSON.toJSONString(brr));
        String crr[]={"还","数学","你哈","英语","科学"};
       String drr[]= charu.HashString(crr);
       System.out.println(JSON.toJSONString(drr));

    }

    public int [] chaRu(int arr[]){
        int temp;
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

    public String [] HashString(String arr[]){
        String temp;
        for (int i=1;i<arr.length;i++){
            for (int j=0;j<i;j++){
                if (arr[j].hashCode()<arr[i].hashCode()){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
