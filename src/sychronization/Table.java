package sychronization;

public class Table {
    public void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n +"*"+ i + " = "+ n*i + " " + i+" Thread");
            try {
                Thread.sleep(4000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
