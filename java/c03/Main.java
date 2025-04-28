class FibonacciThread extends Thread {
    public void run() {
        int n1 = 0, n2 = 1;
        System.out.println("Fibonacci Sequence:");
        for (int i = 0; i < 10; i++) { 
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        System.out.println();
    }
}

class EvenNumberThread extends Thread {
    private int start, end;

    public EvenNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        System.out.println("Even Numbers in Range " + start + " to " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        FibonacciThread fibonacciThread = new FibonacciThread();
        EvenNumberThread evenNumberThread = new EvenNumberThread(1, 20); // Even numbers between 1 and 20

        fibonacciThread.start();
        evenNumberThread.start();
    }
}
