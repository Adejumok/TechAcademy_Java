package intro;

public class GetSquare {
    public static void main(String[] args) {
        int[][] grades = {{2,3,4}, {6,4,2}, {9,8,0}, {4,3,3}};
        display(grades);
        int number = 5;
        System.out.println(square(number));
    }

    static int square(int num){
        return num*num;
    }

    static void display(int[][] arr){
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
