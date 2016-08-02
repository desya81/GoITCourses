package multiThreads;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

/**
 * Created by desya on 12.07.2016.
 */
public class Locks {

    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        final Locks locks = new Locks();
        IntStream.range(0,10).forEach(i->new Thread(locks::testTryLock).start());
    }

    public void test(){
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" tries lock");
        lock.lock();
        try {
            System.out.println(threadName+" executing critical error");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(threadName+" releasing lock");
            lock.unlock();
        }
    }

    public void testTryLock() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" tries lock");

        try{
            if(lock.tryLock(100, TimeUnit.MILLISECONDS)){

                try {
                    System.out.println(threadName+" executing critical error");
                    Thread.sleep(20);
                } finally {
                    System.out.println(threadName+" releasing lock");
                    lock.unlock();
                }
            }else {
                System.out.println(threadName + " Unable acquire lock");
            }

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

