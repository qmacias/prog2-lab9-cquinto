package university.jala.behavioural.observer.plus;

/**
 * @author Cristian Quinto
 */
public final class Notification {
    private final String message;

    public Notification(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
