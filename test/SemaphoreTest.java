import Module3ForEnterprise.SemaphoreExample;
import org.junit.Test;

/**
 * Created by denys on 21.04.16.
 */
public class SemaphoreTest {

    @Test
    public void testSemaphore() throws InterruptedException {
        final SemaphoreExample semaphore = new SemaphoreExample(3);

        for (int i = 0; i < 10; i++) {
            Worker worker = new Worker(semaphore, "Worker" + i);
            worker.join();
            worker.start();
        }
    }

    public class Worker extends Thread{

        private SemaphoreExample semaphoreExample;
        private String workerName;

        public Worker(SemaphoreExample s, String workerName){
            this.semaphoreExample = s;
            this.workerName = workerName;
        }

        @Override
        public void run() {
            System.out.println(this.workerName + " started working...");
            try {
                System.out.println(this.workerName + " waiting ...");
                this.semaphoreExample.acquire();
                System.out.println(this.workerName + " got access to process...");
                //Thread.sleep(10L);
                this.semaphoreExample.release();
                System.out.println(this.workerName + " finished working...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
