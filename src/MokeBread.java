import java.util.ArrayList;
import java.util.List;

public class MokeBread {
    public static void main(String args[]){

    }
}
    class Monk extends Thread{
        public Pool pool;
        public String threadName;
        static List<Monk> monks = new ArrayList<Monk>();
        final int enough = 3;// 几个馒头可以吃饱
        public int eatenCount = 0;
        @Override
        public void run() {
            while(pool.breads > 0) {// 吃饱或者没馒头了就停止线程
                pool.getBread(this);
            }
        }
        Monk(Pool pool,String name) {
            this.pool = pool;
            this.threadName = name;
            monks.add(this);
        }
    }
    class Pool extends Object{
        public int breads;//几个馒头
        private int totalMonks;//几个和尚
        private int evenEatenMonks=0;//已经几个 和尚吃过
        public List<String> statistics=new ArrayList<>();
        boolean hasStastics;

        Pool(int breads,int totalMonks) {
            this.breads = breads;// 馒头总数
            this.totalMonks = totalMonks;// 和尚总数
        }
        public synchronized void getBread(Monk monk){
            if(breads > 0) {
                if(monk.eatenCount == 0 ) {// 这个和尚是第一次吃馒头
                    breads --;// 取走一个馒头
                    evenEatenMonks ++;// 记录已经吃过馒头的和尚数
                    monk.eatenCount ++;
                    System.out.println(monk.threadName+"吃第1个馒头。甑子里还有"+breads+"个馒头。");
                    notifyAll();
                }else {
                    if(evenEatenMonks >= totalMonks ) {// 所有和尚都吃过一个了
                        if(monk.eatenCount < 3) {
                            breads --;// 吃掉一个馒头
                            monk.eatenCount ++;
                            System.out.println("大家都吃过了,"+monk.threadName+"没吃饱，再吃1个馒头吧。甑子里还有"+breads+"个馒头。");
                            notifyAll();
                        }else {// 对于已经吃饱的和尚，停止线程
                            // 这个情况不存在，不用考虑
                        }

                    }else {// 有的和尚还没吃过
                        System.out.println("还有其他人没吃呢，"+monk.threadName+"等等吧。甑子里还有"+breads+"个馒头。");
                        notifyAll();// 通知其它和尚吃
                        try {
                            wait();// 自己等待
                        }catch(Exception e){}
                    }
                }
            }else if(hasStastics == false) {// 馒头已吃完，输出统计数字
                System.out.println("===================统计每个和尚================");
                int total = 0;
                for(int i = 0;i<Monk.monks.size();i++) {
                    Monk m = Monk.monks.get(i);
                    total += m.eatenCount;
                    System.out.println(m.threadName+"总共吃了"+m.eatenCount+"个馒头。");
                }
                System.out.println("所有和尚总共吃了"+total+"个馒头。");
                hasStastics = true;
            }

        }
    }

