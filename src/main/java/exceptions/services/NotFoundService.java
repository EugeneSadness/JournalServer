package exceptions.services;

public class NotFoundService extends ServiceException {
    public NotFoundService() {
    }

    public NotFoundService(String message) {
        super(message);
    }

    public NotFoundService(String message, Throwable cause) {
        super(message, cause);
    }

    public NotFoundService(Throwable cause) {
        super(cause);
    }

    public NotFoundService(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
