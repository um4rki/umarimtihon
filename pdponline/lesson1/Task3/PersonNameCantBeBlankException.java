package lesson1.Task3;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 3:43 PM
 */
public class PersonNameCantBeBlankException extends Exception {
    public PersonNameCantBeBlankException() {}
    public PersonNameCantBeBlankException(String message) {
        super(message);
    }
}
