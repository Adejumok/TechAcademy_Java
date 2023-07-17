package concurrency;

public class MultiImplRun implements Runnable{
    String name;

    public MultiImplRun(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable "+name+"Interface Implemented.");
        }
    }
}
