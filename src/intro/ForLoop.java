package intro;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.println(i+".\n");
                break;
            }
            System.out.print(i+", ");

        }
    }
}
