package university.jala.creational.factory.method;

/**
 * @author Cristian Quinto
 */
public final class DeviceFactory implements Factory {
    @Override
    public Device createTablet() {
        return new Tablet();
    }

    @Override
    public Device createSmartphone() {
        return new Smartphone();
    }

}
