package projects.TicTacToe.exception;

public class GameOverException extends RuntimeException{
    public GameOverException() {
    }

    public GameOverException(String message) {
        super(message);
    }

    public GameOverException(String message, Throwable cause) {
        super(message, cause);
    }

    public GameOverException(Throwable cause) {
        super(cause);
    }

    public GameOverException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
