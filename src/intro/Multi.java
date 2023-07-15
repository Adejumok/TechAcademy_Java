package intro;

public class Multi extends Thread{
    String name;
    public Multi(){

    }
    public Multi(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Thread "+this.name+" is running....");
    }

    public static void main(String[] args) {
        Multi m = new Multi();
        Multi m1 = new Multi("Ojota");
        m.start();
        m1.start();
    }
}
