package strategy;

public class MultiplyOperation implements MathOperation{
    @Override
    public void calculate(double a, double b) {
        double mul  = a * b;
        System.out.println(a + " * " + b + " = " + mul);
    }
}
