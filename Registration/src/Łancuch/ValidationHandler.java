package Łancuch;

import Proxy.User;

public class ValidationHandler extends RegistrationHandler{
    @Override
    public void handle(User user) {
        if (user.getUseranme() == null || user.getUseranme().isEmpty() ||
            user.getPassword() == null || user.getPassword().isEmpty()){

            System.out.println("Pole username i haslo nie moga byc puste");
            return;
        }
        System.out.println("Wszystkie pola uzupelnione !!!");
        super.handle(user);
    }
}
