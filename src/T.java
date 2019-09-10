public class T {

    private static boolean aBoolean;

    public int hash(String key, int tableSize){
        int hashval=0;
        for (int i=0;i<key.length();i++){
            hashval +=key.charAt(i);

        }
        return hashval%tableSize;
    }
    public static void main(String args[]){
        for (String arg : args) {   // 参数由外部定义
            System.out.println(arg);
        }

    }
}
