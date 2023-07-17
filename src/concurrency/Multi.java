package concurrency;

public class Multi extends Thread{
    MultiImplRun runIm;
    String name;
    public Multi(){

    }
    public Multi(MultiImplRun runIm, String name){

        this.runIm = runIm;
        this.name = name;
    }
    public void run(){
        for (int i = 1; i <= 3; i++) {
            System.out.println(this.name+" is running....");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        MultiImplRun multiImplRun = new MultiImplRun("First Thread");
        MultiImplRun m = new MultiImplRun("Second Thread");
        MultiImplRun m1 = new MultiImplRun("Third Thread");
        Multi tt = new Multi(multiImplRun, "First Thread");
        Multi tt2 = new Multi(m, "Second Thread");
        Multi tt3 = new Multi(m1, "Third Thread");
        System.out.println("Implemented runnable started");
        tt.start();
        tt2.start();
        tt3.start();
    }
}
