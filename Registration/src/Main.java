import Proxy.ProxyRegistrationService;
import Proxy.User;
import Łancuch.RegistrationHandler;
import Łancuch.UserNameAvailabilityHandler;
import Łancuch.ValidationHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RegistrationHandler validationEmpty = new ValidationHandler();
        RegistrationHandler usernameAvailability = new UserNameAvailabilityHandler();

        validationEmpty.setNext(usernameAvailability);

        ProxyRegistrationService proxy = new ProxyRegistrationService(true);

        while(true){
            System.out.println("REJESTRACJA!");

            System.out.println("Podaj username: ");
            String username = scanner.next();

            System.out.println("Podaj haslo: ");
            String password = scanner.next();

            User user = new User(username,password);


            validationEmpty.handle(user);
            proxy.register(user);

            System.out.println();
        }
    }
}