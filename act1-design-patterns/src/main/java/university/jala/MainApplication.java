package university.jala;

import university.jala.creational.strategy.Sorter;
import university.jala.creational.strategy.InsertionSortStrategy;
import university.jala.creational.strategy.SelectionSortStrategy;

import university.jala.utils.Utils;

import java.util.Arrays;

/**
 * @author Cristian Qunito
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
                        System.out.println("1. Try insertion sort algorithm");
                        System.out.println("2. Change to selection sort algorithm");

                        System.out.print("Enter a sub-menu option (return with 0): ");
                        subMenuOption = Utils.readInteger();

                        int[] array;
                        int arraySize;

                        Sorter sorter = new Sorter(new InsertionSortStrategy());

                        switch (subMenuOption) {
                            case 1: {
                                System.out.print("Enter integer array size: ");
                                arraySize = Utils.readInteger();

                                array = new int[arraySize];

                                for (int i = 0; i < arraySize; i++) {
                                    System.out.printf("Enter integer array element %d: ", i + 1);
                                    array[i] = Utils.readInteger();
                                }

                                sorter.sort(array);

                                System.out.println("Result:");
                                System.out.println(Arrays.toString(array));
                            }
                            break;
                            case 2: {
                                sorter.setStrategy(new SelectionSortStrategy());

                                System.out.print("Enter integer array size: ");
                                arraySize = Utils.readInteger();

                                array = new int[arraySize];

                                for (int i = 0; i < arraySize; i++) {
                                    System.out.printf("Enter integer array element %d: ", i + 1);
                                    array[i] = Utils.readInteger();
                                }

                                sorter.sort(array);

                                System.out.println("Result:");
                                System.out.println(Arrays.toString(array));
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
