package university.jala.structural.facade;

/**
 * @author Cristian Quinto
 */
public final class NonVegRestaurant implements Hotel {
    public Menus getMenus() {
        NonVegMenu nonVegMenu = new NonVegMenu();

        return nonVegMenu;
    }

}
