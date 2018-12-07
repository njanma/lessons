package _7_multithreading;

public class App_7_priority {
    public static void main(String[] args) {
        Thread threadFst = new Thread(new MyRun(1));
        Thread threadSnd = new Thread(new MyRun(2));
        Thread threadTh = new Thread(new MyRun(3));

        threadFst.setPriority(Thread.MIN_PRIORITY);
        threadSnd.setPriority(Thread.NORM_PRIORITY);
        threadTh.setPriority(Thread.MAX_PRIORITY);

        threadFst.start();
        threadSnd.start();
        threadTh.start();
    }

    private static class MyRun implements Runnable {

        private final int id;

        private MyRun(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            double tmp = 0.0f;
            for (int i = 0; i < 100_999_000; i++) {
                if (i % 20 == 0) {
                    Thread.yield();
                } else {
                    tmp = (Math.PI + Math.E) / tmp;
                }
            }
            System.err.println(id);
        }
    }
}
