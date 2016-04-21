package Module3ForEnterprise;

/**
 * Created by denys on 21.04.16.
 */
public class SemaphoreExample implements Semaphore {

    public volatile int counter = 0;

    public SemaphoreExample() {
        this(0);
    }

    public SemaphoreExample(int counter) {
        if (counter < 0) throw new IllegalArgumentException(counter + " < 0");
        this.counter = counter;

    }

    @Override
    public synchronized void acquire() throws InterruptedException {
        while (this.counter == 0) {
            this.wait();
        }
        this.counter--;
    }

    @Override
    public synchronized void acquire(int permits) throws InterruptedException {
        while (this.counter == permits) {
            this.wait();
        }
        this.counter--;
    }

    @Override
    public synchronized void release() {
        if (this.counter == 0) {
            this.notify();
        }
        this.counter++;
    }

    @Override
    public synchronized void release(int permits) {
        if (this.counter == permits) {
            this.notify();
        }
        this.counter++;
    }

    @Override
    public int getAvailablePermits() {
        return counter;
    }
}
