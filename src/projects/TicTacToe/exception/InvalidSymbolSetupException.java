package projects.TicTacToe.exception;

public class InvalidSymbolSetupException extends RuntimeException{
    public InvalidSymbolSetupException() {
    }

    public InvalidSymbolSetupException(String message) {
        super(message);
    }

    public InvalidSymbolSetupException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSymbolSetupException(Throwable cause) {
        super(cause);
    }

    public InvalidSymbolSetupException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
