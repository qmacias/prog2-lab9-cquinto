package university.jala.structural.facade;

/**
 * @author Cristian Quinto
 */
public final class VegRestaurant implements Hotel {
    public Menus getMenus() {
        VegMenu vegMenu = new VegMenu();

        return vegMenu;
    }

}
