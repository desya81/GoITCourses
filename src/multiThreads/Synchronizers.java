package multiThreads;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Exchanger;
import java.util.stream.IntStream;

/**
 * Created by desya on 28.07.2016.
 */
public class Synchronizers {

    public static void main(String[] args) throws InterruptedException {
        Synchronizers synchronizers = new Synchronizers();
        //synchronizers.testCyclicBarrier(); // uncomment for use cyclebarrier
        synchronizers.testExchanger();
    }

    public void testCyclicBarrier() throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println("Barrier exceeded"));
        while (true){
            new Thread(()->{
                try {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + " starts wait");
                    barrier.await();
                    System.out.println(threadName + " finish await");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            }).start();
            Thread.sleep(1000);
        }
    }

    /**
     * Useful for change data between 2 threads
     */
    public void testExchanger(){
        Exchanger<String> exchager = new Exchanger<>();
        IntStream.range(0 ,2).forEach((i)-> new Thread(()->{
            try {
                Thread.sleep(new Random().nextInt(1000));
                String name = Thread.currentThread().getName();
                System.out.println(name + " ready for exchange");
                System.out.println(name + " < - > " + exchager.exchange(name));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start());
    }
}
