package Module3ForEnterprise;

/**
 * Created by denys on 21.04.16.
 */
public interface Semaphore {
    public void acquire() throws InterruptedException;

    public void acquire(int permits) throws InterruptedException;

    public void release();

    public void release(int permits);

    public int getAvailablePermits();

}
