package intro;

import java.util.Scanner;

public class TestArithmeticEngine {
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first and second number: ");
            double first = input.nextDouble();
            double second = input.nextDouble();
            ArithmeticEngine a = new ArithmeticEngine(first, second);
            System.out.printf("%s + %s = %s", first, second, a.addTwoNums());

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
