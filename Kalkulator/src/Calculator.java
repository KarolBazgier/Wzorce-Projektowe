import abstractFactory.AbstractFactory;
import strategy.MathOperation;

public class Calculator {
    private MathOperation mathOperation;
    private final AbstractFactory abstractFactory;
    public Calculator() {
        this.abstractFactory = new AbstractFactory();
    }

    public void setMathOperation(String type) {
        this.mathOperation = abstractFactory.createMathOperation(type);
    }

    public void calculate(double a, double b){
        if (mathOperation!=null){
            this.mathOperation.calculate(a,b);
        }
        else {
            throw new IllegalArgumentException("choose operation");
        }
    }
}

