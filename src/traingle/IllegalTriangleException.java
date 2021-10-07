package traingle;

public class IllegalTriangleException extends Exception {
    private String message;


    public IllegalTriangleException(String message) {
        super(message);
        this.message = message;
    }

}
