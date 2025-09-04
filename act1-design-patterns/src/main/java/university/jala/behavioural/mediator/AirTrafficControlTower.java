package university.jala.behavioural.mediator;

/**
 * @author Cristian Quinto
 */
public interface AirTrafficControlTower {
    void requestTakeoff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
