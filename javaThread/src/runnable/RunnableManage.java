package runnable;

/**
 * 实现Runnable接口实现多线程
 */
public class RunnableManage {
    public static void main(String args[]){
        for(int i=0;i<5;i++){
            MyThread myThread = new MyThread(i+"伍思强:");
            new Thread(myThread).start();
        }


    }
}


class MyThread implements Runnable {
    private String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println(this.threadName + i);
        }
    }
}