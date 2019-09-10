import java.util.*;

public class ss {
    public static void main(String args[]) {
        List <Integer>inList=new ArrayList<Integer>(Arrays.asList(0,1,2,3));
        inList.add(22);
        System.out.println(inList);
        System.out.println(inList.get(3));
        int[] i=new int[7];
        int[] j=new int[10];
        Arrays.fill(i,47);
        Arrays.fill(j,99);
        System.out.println( "i="+Arrays.toString(i));
        System.out.println( "j="+Arrays.toString(j));
        System.arraycopy(i,0,j,0,i.length);
        System.out.println( "j="+Arrays.toString(j));
        int []k=new int[5];
        Arrays.fill(k,103);
        System.arraycopy(i,0,k,0,k.length);
        System.out.println( "k="+Arrays.toString(k));
        Arrays.fill(k,103);
        System.arraycopy(k,0,i,0,k.length);
        System.out.println( "i="+Arrays.toString(i));
        Integer[] u=new Integer[10];
        Integer[] v=new Integer[5];
        Arrays.fill(u,new Integer(47));
        Arrays.fill(v,new Integer(99));
        System.out.println( "u="+Arrays.toString(u));
        System.out.println( "v="+Arrays.toString(v));
        System.arraycopy(v,0,u,u.length/2,v.length);
        System.out.println( "u="+Arrays.toString(u));
        LinkedHashSet hashSet=new LinkedHashSet();
        hashSet.add(1);
        hashSet.add("Äã¹þ");
        hashSet.add("x");
        HashMap hashMap=new HashMap();
        hashMap.put("name","ÕÅÈý");
        hashMap.put("age",19);
        hashMap.put("tel","13558849");
        Set<String> set=hashMap.keySet();
        for (String key:set){
            System.out.println(hashMap.get(key).toString());
        }
        try {
            Thread thread=new Thread();
            thread.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}