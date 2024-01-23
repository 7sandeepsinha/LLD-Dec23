package designPatterns.builder;

public class GradYearInvalidException extends RuntimeException {
    public GradYearInvalidException() {
    }

    public GradYearInvalidException(String message) {
        super(message);
    }

    public GradYearInvalidException(String message, Throwable cause) {
        super(message, cause);
    }

    public GradYearInvalidException(Throwable cause) {
        super(cause);
    }

    public GradYearInvalidException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
