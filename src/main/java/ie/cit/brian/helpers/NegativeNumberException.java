package ie.cit.brian.helpers;

/**
 * Created by brian on 20/04/17.
 */
public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException() {
        this("Negative number not allowed here!");
    }

    public NegativeNumberException(String message) { super(message); }


}
