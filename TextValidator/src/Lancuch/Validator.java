package Lancuch;

public abstract class Validator {
    protected Validator next;
    public void setNext(Validator next) {
        this.next = next;
    }

    public abstract boolean validate(String input);

    protected boolean passNext(String input){
        if (next != null){
            return next.validate(input);
        }else {
            return true;
        }

    }


}
