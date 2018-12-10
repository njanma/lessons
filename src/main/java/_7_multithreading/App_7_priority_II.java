package _7_multithreading;

public class App_7_priority_II {

    public static void main(String[] args) {
        Thread threadFst = new Thread(new MyIdxRun(1));
        Thread threadSnd = new Thread(new MyIdxRun(2));
        Thread threadTh = new Thread(new MyIdxRun(3));

        threadFst.setPriority(Thread.MIN_PRIORITY);
        threadSnd.setPriority(Thread.NORM_PRIORITY);
        threadTh.setPriority(Thread.MAX_PRIORITY);


        new Thread(() -> block(Integer.MAX_VALUE)).start();

        threadFst.start();
        threadSnd.start();
        threadTh.start();
    }
    static synchronized void block(int idx){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println(idx);
    }

    static class MyIdxRun implements Runnable {
        final int idx;

        MyIdxRun(int idx) {
            this.idx = idx;
        }

        @Override
        public void run() {
            block(idx);
        }
    }
}
