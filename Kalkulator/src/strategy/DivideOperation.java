package strategy;

public class DivideOperation implements MathOperation{
    @Override
    public void calculate(double a, double b) {
        if (b==0){
            throw new ArithmeticException("Nie dzielimy przez 0");
        }else {
            double div = a / b;
            System.out.println(a + " / " + b + " = " + div);
        }
    }
}
