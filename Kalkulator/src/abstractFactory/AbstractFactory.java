package abstractFactory;

import strategy.*;

public class AbstractFactory {
    public MathOperation createMathOperation(String type){
        return switch (type){
            case "1" -> new AddOperation();
            case "2" -> new SubtractOperation();
            case "3" -> new MultiplyOperation();
            case "4" -> new DivideOperation();
            default -> throw new IllegalArgumentException("not implemented");
        };
    }
}
