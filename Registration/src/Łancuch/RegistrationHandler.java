package Łancuch;

import Proxy.User;

public class RegistrationHandler {
    protected RegistrationHandler next;

    public void setNext(RegistrationHandler next) {
        this.next = next;
    }

    public void handle(User user){
        if (next != null){
            next.handle(user);
        }
    }
}
