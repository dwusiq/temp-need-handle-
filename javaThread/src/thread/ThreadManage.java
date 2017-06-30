package thread;

/**
 * 集成Thread类
 */
public class ThreadManage {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            MyThread mt = new MyThread(i+"伍思强:");
            mt.start();
        }
    }
}

class MyThread extends Thread{
    public MyThread(String threadName){
        this.setName(threadName);
    }
    @Override
    public void run() {
        for(int i=0;i<30;i++){
            System.out.println(this.getName()+i);
        }

    }
}