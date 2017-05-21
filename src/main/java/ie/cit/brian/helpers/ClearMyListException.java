package ie.cit.brian.helpers;

/**
 * Created by brian on 21/05/17.
 */
public class ClearMyListException extends RuntimeException{

    public ClearMyListException() {
        this("Clearing this list is not allowed!");
    }

    public ClearMyListException(String message) { super(message); }
}
