package university.jala.creational.singleton;

/**
 * @author Cristian Quinto
 */
public final class DatabaseConnection {
    private static DatabaseConnection INSTANCE = null;

    private DatabaseConnection() {
        System.out.println("Connecting to database...");
    }

    public static DatabaseConnection getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DatabaseConnection();
        }

        return INSTANCE;
    }

}
