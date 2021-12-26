package old.exception;

public class OssException extends RuntimeException {
    public OssException(Throwable cause) {
        super(cause);
    }

    public OssException(String message) {
        super(message);
    }
}
