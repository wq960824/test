package Tree;

import com.alibaba.fastjson.JSON;

public class Test {
    public static void main(String args[]){
        BinaryNode binaryNode=new BinaryNode();
        BinaryNode binaryNode1=new BinaryNode();
        BinaryNode binaryNode2=new BinaryNode();
        binaryNode.setElement(1);
        binaryNode1.setElement(2);
        binaryNode2.setElement(3);
        binaryNode.setLeft(binaryNode1);
        binaryNode.setRight(binaryNode2);
        System.out.println(JSON.toJSONString(binaryNode));
        System.out.println(JSON.toJSONString(binaryNode.getLeft()));
    }
}
