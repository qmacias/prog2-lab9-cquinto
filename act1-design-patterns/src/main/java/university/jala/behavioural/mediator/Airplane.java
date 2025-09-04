package university.jala.behavioural.mediator;

/**
 * @author Cristian Quinto
 */
public interface Airplane {
    void requestTakeoff();
    void requestLanding();
    void notifyAirTrafficControl(String message);
}
