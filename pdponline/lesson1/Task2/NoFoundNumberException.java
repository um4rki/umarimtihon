package lesson1.Task2;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 12:28 PM
 */
public class NoFoundNumberException extends Exception {
    public NoFoundNumberException() {}
    public NoFoundNumberException(String message) {
        super(message);
    }

}