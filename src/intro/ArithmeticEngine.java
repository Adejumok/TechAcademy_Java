package intro;

import next.RunningI;

public class ArithmeticEngine implements RunningI {
    private double firstNumber;
    private double secondNumber;

    public ArithmeticEngine(double first, double second){
        this.firstNumber = first;
        this.secondNumber = second;
    }
    @Override
    public  double addTwoNums(){
        return this.firstNumber + this.secondNumber;
    }
    @Override
    public double power(double firstN, double secondN){
        if (secondN == 0){
            return 1;
        }
        return firstN * power(firstN, secondN - 1);
    }

}
