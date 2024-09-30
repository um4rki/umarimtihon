package lesson1.Task3;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 3:42 PM
 */
public class RangCantBeBlankException extends NullPointerException {
    public RangCantBeBlankException() {}
    public RangCantBeBlankException(String message) {
        super(message);
    }
}
