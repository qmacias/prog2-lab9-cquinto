package university.jala.behavioural.observer.plus;

/**
 * @author Cristian Quinto
 */
public final class TwitterNotificationService implements EventSubscriber {
    @Override
    public void on(Notification notification) {
        System.out.printf("Twitter notification: %s\n", notification.getMessage());
    }

}
