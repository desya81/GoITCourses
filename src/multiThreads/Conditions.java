package multiThreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.IntStream;

public class Conditions {

    public static void main(String[] args) {
        TransferQueue<String> transferQueue = new TransferQueue<>(10);
        IntStream.range(0, 5).forEach((i)-> new Thread(
                ()->{
                    while (true){
                        try {
                            Thread.sleep(1000);
                            transferQueue.put(Thread.currentThread().getName());
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
        ).start());
        new Thread(
                ()->{
                    try {
                        System.out.println("Taking out: " + transferQueue.take());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        ).start();

    }

    public static class TransferQueue<T>{

        Object[] items;
        int putIndex = 0;
        int takeIndex = 0;
        int size = 0;

        private final Lock lock = new ReentrantLock();
        private final Condition full = lock.newCondition();
        private final Condition empty = lock.newCondition();

        public TransferQueue(int capacity) {
            this.items = new Object[capacity];
        }

        public void put(T value) throws InterruptedException {
            lock.lock();
            try{
                while(size == items.length){
                    System.out.println("Queue is full. " + Thread.currentThread().getName() + " start waiting");
                    full.await();
                }
                items[putIndex] = value;
                if(++putIndex == items.length){
                    putIndex = 0;
                }
                size++;
                empty.signal();

            }finally {
                lock.unlock();
            }
        }

        public T take() throws InterruptedException {
            lock.lock();

            try {
                while(size == 0){
                    System.out.println("Queue is empty. " + Thread.currentThread().getName() + " start waiting");
                    empty.await();
                }
                T result = (T) items[takeIndex];
                if(++takeIndex == items.length){
                    takeIndex = 0;
                }
                size--;
                full.signal();
                return result;
            }finally {
                lock.unlock();

            }

        }
    }
}
