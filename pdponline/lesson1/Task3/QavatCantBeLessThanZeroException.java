package lesson1.Task3;

/**
 * Created by: Umar
 * DateTime: 8/20/2024 3:41 PM
 */
public class QavatCantBeLessThanZeroException extends Exception{
    public QavatCantBeLessThanZeroException(){
    }
    public QavatCantBeLessThanZeroException(String message){
        super("Qavat 0 dan kichik bo'lmaydi");
    }
}
