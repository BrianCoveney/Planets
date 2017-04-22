package ie.cit.brian.planets.helpers;

/**
 * Created by brian on 20/04/17.
 */
public class NegativeNumberException extends RuntimeException {

    public NegativeNumberException() {  }

    public NegativeNumberException(String message) { super(message); }

    public NegativeNumberException(Throwable cause) { super(cause); }

    public NegativeNumberException(String message, Throwable cause) { super(message, cause); }


}
