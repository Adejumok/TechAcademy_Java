package intro;

public class ReturnWithValue {
    int sum(int x, int y){
        return x + y;
    }

    static int diff(int x, int y){
        return x - y;
    }

    public static void main(String[] args) {
        ReturnWithValue value = new ReturnWithValue();
        System.out.println((value.sum(5,3))+" and " +(diff(7,9)));
    }
}
