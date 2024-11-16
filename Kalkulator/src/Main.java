import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            try {
                System.out.println("Podaj 1 liczbe: ");
                double a = scanner.nextDouble();

                System.out.println("Podaj 2 liczbe: ");
                double b = scanner.nextDouble();

                System.out.println("Wybierz operacje: ");
                System.out.println("1 - dodawanie");
                System.out.println("2 - odejmowanie");
                System.out.println("3 - mnozenie");
                System.out.println("4 - dzielenie");
                String operation = scanner.next();

                calculator.setMathOperation(operation);
                calculator.calculate(a, b);

                System.out.println("chcesz wyjsc wpisz: 't'");
                String tn = scanner.next();
                if (tn.equals("t")){
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("wprowadzona wartosc nie jest liczba " );
                break;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
                break;
            } catch (Exception e) {
                System.out.println("Nieoczkiwany blad: " );
                break;
            }
        }
        scanner.close();
    }
}