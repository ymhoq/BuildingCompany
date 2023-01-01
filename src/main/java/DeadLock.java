import Buildings.Catalog;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DeadLock {

    private static final Logger LOGGER = LogManager.getLogger(DeadLock.class);

    public static void start() {

        Catalog catalog1 = new Catalog();
        Catalog catalog2 = new Catalog();

        Thread thread1 = new Thread(() -> {
            LOGGER.info(Thread.currentThread().getName() + "start");
            synchronized (catalog1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {

                }
                synchronized (catalog2) {

                }
            }

            LOGGER.info(Thread.currentThread().getName() + "finish");
        }, "Thread1");

        Thread thread2 = new Thread(() -> {

            LOGGER.info(Thread.currentThread().getName() + "start");
            synchronized (catalog2) {

                synchronized (catalog1) {

                }
            }

            LOGGER.info(Thread.currentThread().getName() + "finish");
        }, "Thread2");

        thread1.start();
        thread2.start();

    }
}
