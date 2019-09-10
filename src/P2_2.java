import java.util.Scanner;

public class P2_2 {

    class DATA2{
        String Key;
        String name;
        int age;
    }
    class CLType{
        DATA2 nodeData=new DATA2();
        CLType nextNode;

        CLType  CLAddEnd(CLType head,DATA2 nodeData){
            CLType node,htemp;
            if ((node=new CLType())==null){
                System.out.println("申请内存失败！\n");
                return null;
            }
            else {
                node.nodeData=nodeData;
                node.nextNode=null;
                if (head==null){
                    head=node;
                    return head;
                }
                htemp=head;
                while (htemp.nextNode!=null){
                    htemp=htemp.nextNode;
                }
                htemp.nextNode=nextNode;
                return head;
            }
        }
        CLType ClAddFirst(CLType head,DATA2 nodeData){
            CLType node;
            if ((node=new CLType())==null){
                System.out.println("申请内存失败！\n");
                return null;
            }
            else {
                node.nodeData=nodeData;
                node.nextNode=head;
                head=node;
                return head;
            }
        }
        CLType CLFindNode(CLType head,String key){
            CLType htemp;
            htemp=head;
            while (htemp!=null){
                if (htemp.nodeData.Key.compareTo(key)==0){
                    return htemp;
                }
                htemp=htemp.nextNode;

            }
            return null;
        }
        CLType CLInsertNode(CLType head,String findKey,DATA2 nodeData){
            CLType node,nodetemp;
            if ((node=new CLType())==null){
                System.out.println("申请内存失败！\n");
                return null;
            }
            node.nodeData=nodeData;
            nodetemp=CLFindNode(head,findKey);
            if (nodetemp!=null){
                node.nextNode=nodetemp.nextNode;
                nodetemp.nextNode=node;
            }else {
                System.out.println("未能找到正确的插入位置 \n");

            }
            return head;

        }
        int CLDeleteNode(CLType head,String key){
            CLType node,htemp;
            htemp=head;
            node=head;
            while (htemp!=null){
                    if (htemp.nodeData.Key.compareTo(key)==0){
                        node.nextNode=htemp.nextNode;
                        return 1;
                    }else {
                        node=htemp;
                        htemp=htemp.nextNode;
                    }
            }
            return 0;
        }

        int CLLength(CLType head){
            CLType htemp;
            int Len=0;
            htemp=head;
            while (htemp!=null){
                Len++;
                htemp=nextNode;
            }
            return Len;
        }
        void CLAllNode (CLType head){
            CLType htemp;
            DATA2 nodeData;
            htemp=head;
            while (htemp!=null){
                nodeData=htemp.nodeData;
                System.out.println(nodeData+nodeData.name+nodeData.Key+nodeData.age);
                htemp=htemp.nextNode;
            }
        }

    }
    public  void main(String args[]){
        CLType node ,head=null;
        CLType CL= new CLType();
        String key,findKey;
        Scanner input =new Scanner(System.in);
        do {
            DATA2 nodeData =new DATA2();
            nodeData.Key=input.next();
            if (nodeData.Key.equals("0")){
                break;
            }else {

                nodeData.name=input.next();
                nodeData.age=input.nextInt();
                head=CL.CLAddEnd(head,nodeData);
            }

        }
        while (true);
        CL.CLAllNode(head);
        System.out.println("\n 演示插入节点 输入插入位置的关键点");

    }
}
