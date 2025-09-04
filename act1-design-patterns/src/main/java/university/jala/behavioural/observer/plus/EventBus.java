package university.jala.behavioural.observer.plus;

/**
 * @author Cristian Quinto
 */
public interface EventBus {
    void publish(Notification notification);
    void addSubscriber(EventSubscriber subscriber);
}
