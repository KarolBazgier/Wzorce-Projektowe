package Proxy;

public class RealRegistrationService implements RegistrationService {
    @Override
    public void register(User user) {
        System.out.println("Uzytkownik: " + user.getUseranme() + " zarejestrowany" );
    }
}
