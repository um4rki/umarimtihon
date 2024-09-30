package lesson1.Task3;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 3:42 PM
 */
public class RoomCountCantBeLessThanTenException extends Exception {
    public RoomCountCantBeLessThanTenException() {}
    public RoomCountCantBeLessThanTenException(String message) {
        super(message);
    }
}
