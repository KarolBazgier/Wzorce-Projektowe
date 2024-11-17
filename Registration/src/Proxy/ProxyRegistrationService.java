package Proxy;

public class ProxyRegistrationService implements RegistrationService {
    private RealRegistrationService realService;
    private boolean access;

    public ProxyRegistrationService(boolean access) {
        this.access = access;
        this.realService = new RealRegistrationService();
    }

    @Override
    public void register(User user) {
        if (access) {
            realService.register(user);
        }else {
            System.out.println("Nie mozna zarejestrowac uzytkownika: " + user.getUseranme() );
        }
    }
}
