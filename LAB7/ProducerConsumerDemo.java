//1) Implement Producer, Consumer problem using Thread in Java.
import java.util.LinkedList;
import java.util.Queue;

class SharedQueue {
    private final Queue<Integer> queue = new LinkedList<>();
    private final int CAPACITY = 5;

    public synchronized void produce(int value) throws InterruptedException {
        while (queue.size() == CAPACITY) {
            wait(); // wait if queue is full
        }
        queue.add(value);
        System.out.println("Produced: " + value);
        notify(); // notify consumer
    }

    public synchronized void consume() throws InterruptedException {
        while (queue.isEmpty()) {
            wait(); // wait if queue is empty
        }
        int value = queue.poll();
        System.out.println("Consumed: " + value);
        notify(); // notify producer
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        SharedQueue shared = new SharedQueue();

        Thread producer = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    shared.produce(value++);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    shared.consume();
                    Thread.sleep(800);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
