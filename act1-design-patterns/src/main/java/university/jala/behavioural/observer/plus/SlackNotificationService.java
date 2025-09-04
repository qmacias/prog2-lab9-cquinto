package university.jala.behavioural.observer.plus;

/**
 * @author Cristian Quinto
 */
public final class SlackNotificationService implements EventSubscriber {
    @Override
    public void on(Notification notification) {
        System.out.printf("Slack notification: %s\n", notification.getMessage());
    }

}
