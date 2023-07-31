/* Program to know how to implement Runnable Interface and Thread function using Lambda Expressions */
class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Running Thread Demo.....");
    }

}

public class RunnableLamdbaExample {

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadDemo());
        thread.start();

        // Runnable runnable = () -> System.out.println("Running Lambda Thread
        // Demo.....");
        // Thread threadLambda = new Thread(runnable);
        Thread threadLambda = new Thread(() -> System.out.println("Running Lambda Thread Demo....."));
        threadLambda.start();
    }
}
