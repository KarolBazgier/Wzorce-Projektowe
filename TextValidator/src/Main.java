import Fabryka.ValidatorFactory;
import Lancuch.Validator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Validator validator = ValidatorFactory.createChain("lenght", "alpha");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Aplikacja do walidacji tekstu: ");

        while (true){
            System.out.println("Podaj tekst: ");
            String input = scanner.nextLine();
            if (validator.validate(input)) {
                System.out.println("Walidacja udana : " + input);
            } else {
                System.out.println("Walidacja nie udana !!!");
            }
        }
    }
}