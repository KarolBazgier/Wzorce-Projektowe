package Fabryka;

import Lancuch.AlphaValidator;
import Lancuch.LenghtValidator;
import Lancuch.Validator;

public class ValidatorFactory {
    public static Validator createValidator(String type) {
        switch (type) {
            case "lenght":
                return new LenghtValidator(5);
            case "alpha":
                return new AlphaValidator();
            default:
                throw new IllegalArgumentException("Nie ma atakiego validatora !!!");
        }
    }

    public static Validator createChain(String... types) {
        Validator head = null;
        Validator current = null;

        for (String type : types) {
            Validator validator = createValidator(type);
            if (head == null) {
                head = validator;
                current = validator;
            } else {
                current.setNext(validator);
                current = validator;
            }
        }
        return head;
    }
}
