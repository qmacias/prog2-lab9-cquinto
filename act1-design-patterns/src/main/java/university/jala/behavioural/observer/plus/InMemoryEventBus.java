package university.jala.behavioural.observer.plus;

import java.util.List;

/**
 * @author Cristian Quinto
 */
public final class InMemoryEventBus implements EventBus {
    private final List<EventSubscriber> subscribers;

    public InMemoryEventBus(List<EventSubscriber> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void addSubscriber(EventSubscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void publish(Notification notification) {
        for (EventSubscriber subscriber : subscribers) {
            subscriber.on(notification);
        }
    }

}
