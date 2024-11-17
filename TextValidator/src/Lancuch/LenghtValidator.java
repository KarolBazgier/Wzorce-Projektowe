package Lancuch;

public class LenghtValidator extends Validator{

    public LenghtValidator(int minLenght) {
        this.minLenght = minLenght;
    }

    private int minLenght;


    @Override
    public boolean validate(String input) {
        if (input.length() < minLenght){
            System.out.println("Tekst za krótki !!! Min: " + minLenght);
            return false;
        }

        return passNext(input);
    }
}
