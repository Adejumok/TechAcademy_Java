package intro;

public class Pyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        int t = 6;
        for (int i = 1; i <= t; i++) {
            for (int j = t; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
