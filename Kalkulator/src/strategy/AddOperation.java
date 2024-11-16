package strategy;

public class AddOperation implements MathOperation{
    @Override
    public void calculate(double a, double b) {
        double sum = a+b;
        System.out.println(a + " + " + b + " = " + sum);
    }
}
