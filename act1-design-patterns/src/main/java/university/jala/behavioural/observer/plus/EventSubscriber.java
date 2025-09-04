package university.jala.behavioural.observer.plus;

/**
 * @author Cristian Quinto
 */
public interface EventSubscriber {
    void on(Notification notification);
}
