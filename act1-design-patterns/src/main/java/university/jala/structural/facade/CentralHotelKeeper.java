package university.jala.structural.facade;

/**
 * @author Cristian Quinto
 */
public final class CentralHotelKeeper implements HotelKeeper {
    public VegMenu getVegMenu() {
        VegRestaurant vegRestaurant = new VegRestaurant();

        VegMenu vegMenu = (VegMenu) vegRestaurant.getMenus();

        return vegMenu;
    }

    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant = new NonVegRestaurant();

        NonVegMenu nonVegMenu = (NonVegMenu) nonVegRestaurant.getMenus();

        return nonVegMenu;
    }

}
