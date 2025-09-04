package university.jala;

import university.jala.behavioural.mediator.AirTrafficControlTower;
import university.jala.behavioural.mediator.Airplane;
import university.jala.behavioural.mediator.AirportControlTower;
import university.jala.behavioural.mediator.CommercialAirplane;

import university.jala.behavioural.observer.plus.*;
import university.jala.creational.factory.method.Device;
import university.jala.creational.factory.method.DeviceFactory;
import university.jala.creational.singleton.DatabaseConnection;

import university.jala.creational.strategy.Sorter;
import university.jala.creational.strategy.QuickSortStrategy;
import university.jala.creational.strategy.BubbleSortStrategy;

import university.jala.structural.adapter.LegacyPrinter;
import university.jala.structural.adapter.Printer;
import university.jala.structural.adapter.PrinterAdapter;

import university.jala.structural.facade.HotelKeeper;
import university.jala.structural.facade.CentralHotelKeeper;
import university.jala.structural.facade.NonVegMenu;
import university.jala.structural.facade.VegMenu;

import university.jala.utils.Utils;

import java.util.ArrayList;

/**
 * @author Cristian Quinto
 */
public class MainApplication {
    public static void clientCode(Printer printer) {
        printer.print();
    }

    public static void main(String[] args) {
        int option;
        int subMenuOption;

        do {
            System.out.println("1. Strategy DP");
            System.out.println("2. Singleton DP");
            System.out.println("3. Mediator DP");
            System.out.println("4. Adapter DP");
            System.out.println("5. Factory DP");
            System.out.println("6. Facade DP");
            System.out.println("7. Observer DP (plus, Tutoring Sessions)");

            System.out.print("Enter a menu option (exit with 0): ");
            option = Utils.readInteger();

            switch (option) {
                case 1: {
                    do {
                        System.out.println("1. Try Bubble Sort algorithm");
                        System.out.println("2. Change to Quick Sort algorithm");

                        System.out.print("Enter a sub-menu option (return with 0): ");
                        subMenuOption = Utils.readInteger();

                        int[] array = new int[] {3, 1, 4, 2};

                        Sorter sorter = new Sorter(new BubbleSortStrategy());

                        switch (subMenuOption) {
                            case 1: {
                                sorter.sort(array);
                            }
                            break;
                            case 2: {
                                sorter.setStrategy(new QuickSortStrategy());

                                sorter.sort(array);
                            }
                            break;
                            case 0: {
                                System.out.println("Returning to main menu...");
                            }
                            break;
                            default: {
                                System.out.println("Invalid option. Try again.");
                            }
                            break;
                        }
                    } while (subMenuOption != 0);
                }
                break;
                case 2: {
                    DatabaseConnection db1 = DatabaseConnection.getInstance();
                    DatabaseConnection db2 = DatabaseConnection.getInstance();

                    assert db1 == db2;
                }
                break;
                case 3: {
                    AirTrafficControlTower controlTower = new AirportControlTower();

                    Airplane airplane1 = new CommercialAirplane(controlTower);
                    Airplane airplane2 = new CommercialAirplane(controlTower);

                    airplane1.requestTakeoff();
                    airplane2.requestLanding();
                }
                break;
                case 4: {
                    PrinterAdapter adapter = new PrinterAdapter(new LegacyPrinter());

                    clientCode(adapter);
                }
                break;
                case 5: {
                    DeviceFactory factory = new DeviceFactory();

                    Device tablet = factory.createTablet();
                    Device smartphone = factory.createSmartphone();

                    tablet.display();
                    smartphone.display();
                }
                break;
                case 6: {
                    HotelKeeper keeper = new CentralHotelKeeper();

                    VegMenu keeperVegMenu = keeper.getVegMenu();
                    NonVegMenu keeperNonVegMenu = keeper.getNonVegMenu();

                    keeperVegMenu.show();
                    keeperNonVegMenu.show();
                }
                break;
                case 7: {
                    EventBus eventBus = new InMemoryEventBus(new ArrayList<>());

                    eventBus.addSubscriber(new SlackNotificationService());
                    eventBus.addSubscriber(new TwitterNotificationService());

                    Notification notification = new Notification("This is an example notification.");

                    eventBus.publish(notification);
                }
                break;
                case 0: {
                    System.out.println("Bye! See you soon.");
                }
                break;
                default: {
                    System.out.println("Invalid option. Try again.");
                }
                break;
            }
        } while (option != 0);
    }

}
