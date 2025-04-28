class SharedBuffer {
    private int capacity = 10; 
    private int buffer = 0;    

    public synchronized void produce() throws InterruptedException {
        while (buffer >= capacity) { 
            wait(); 
        }
        buffer++; 
        System.out.println("Produced: " + buffer);
        notify(); 
    }

    public synchronized void consume() throws InterruptedException {
        while (buffer <= 0) { 
            wait(); 
        }
        System.out.println("Consumed: " + buffer);
        buffer--;
        notify(); 
    }
}

class Producer extends Thread {
    private SharedBuffer sharedBuffer;

    public Producer(SharedBuffer buffer) {
        this.sharedBuffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 20; i++) { 
                sharedBuffer.produce();
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Consumer extends Thread {
    private SharedBuffer sharedBuffer;

    public Consumer(SharedBuffer buffer) {
        this.sharedBuffer = buffer;
    }

    public void run() {
        try {
            for (int i = 0; i < 20; i++) { 
                sharedBuffer.consume();
                Thread.sleep(1500); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ProducerConsumerExample {
    public static void main(String[] args) {
        SharedBuffer sharedBuffer = new SharedBuffer();
        
        Producer producer = new Producer(sharedBuffer);
        Consumer consumer = new Consumer(sharedBuffer);

        producer.start();
        consumer.start();
    }
}
