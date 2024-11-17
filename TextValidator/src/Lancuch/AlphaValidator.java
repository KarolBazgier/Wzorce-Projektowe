package Lancuch;

public class AlphaValidator extends Validator{

    @Override
    public boolean validate(String input) {
        if (!input.matches("[a-zA-Z]+")){
            System.out.println("Tekst moze zawierac tylko litery !!!");
            return false;
        }

        return passNext(input);
    }
}
