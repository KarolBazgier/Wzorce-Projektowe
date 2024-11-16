package strategy;

public class SubtractOperation implements MathOperation{
    @Override
    public void   calculate(double a, double b) {
        double sub  = a - b;
        System.out.println(a + " - " + b + " = " + sub);
    }
}
