package Łancuch;

import Proxy.User;

import java.util.HashSet;
import java.util.Set;

public class UserNameAvailabilityHandler extends RegistrationHandler {
    private static Set<String> registeredUsernames = new HashSet<>();


    @Override
    public void handle(User user) {
        if (registeredUsernames.contains(user.getUseranme())) {
            System.out.println("Username jest juz zajety !!!");
            throw new IllegalArgumentException("Rejestracja przerwana: zajęty username.");
        }
        registeredUsernames.add(user.getUseranme());
        System.out.println("Username dostępny.");

        super.handle(user);
    }

}
