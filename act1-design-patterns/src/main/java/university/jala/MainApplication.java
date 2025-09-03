package university.jala;

import university.jala.creational.strategy.Sorter;
import university.jala.creational.strategy.QuickSortStrategy;
import university.jala.creational.strategy.BubbleSortStrategy;

import university.jala.utils.Utils;

/**
 * @author Cristian Quinto
 */
public class MainApplication {
    public static void main(String[] args) {
        int option;
        int subMenuOption;

        do {
            System.out.println("1. Strategy DP");
            System.out.println("2. Option 2");
            System.out.println("3. Option 3");
            System.out.println("4. Option 4");
            System.out.println("5. Option 5");

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
                    System.out.println("(2) Not implemented yet.");
                }
                break;
                case 3: {
                    System.out.println("(3) Not implemented yet.");
                }
                break;
                case 4: {
                    System.out.println("(4) Not implemented yet.");
                }
                break;
                case 5: {
                    System.out.println("(5) Not implemented yet.");
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
