import Buildings.Catalog;
import Buildings.Ground;
import Buildings.WoodHouse;
import Enums.Directions;
import Enums.Gender;
import Exeptions.IncorrectDataExсeption;
import ManagerMenu.Order;
import ManagerMenu.Orders;
import People.Builder;
import People.Manager;
import People.Customer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Modulation {
    private static final Logger LOGGER = LogManager.getLogger(Modulation.class);

    public static void main(String[] args) {


        Builder builder = null;
        try {
            builder = new Builder("Peter", "Gaus", 34, Gender.MALE, "3099", "Peter@gmail.com", 1000, 0, 20);
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }

        LOGGER.info(builder);

        Manager manager = null;
        try {
            manager = new Manager("Kate", "Pavliuk", 24, Gender.FEMALE,
                    "38095", "kate@gmail.com", 2000, 20);
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }
        Customer customer = null;
        try {
            customer = new Customer("John", "Smith", 40, Gender.MALE,
                    "3097", "john@gmail.com");
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }

        Ground ground = new Ground(30, 30, 1, Directions.EAST, 2, 1, 0);

        WoodHouse woodHouse = new WoodHouse(10, 10, 4, 0, 1, 1, 2, 40);

        Order order = new Order(1, manager, customer, ground, woodHouse, 0, false);

        order.countAmountOfOrder(order, a -> order.getBuilding().hashCode() + order.getGround().hashCode() * order.getGround().getCoeffCount());

        builder.setLockedBuildingId(order.getId());


        Catalog catalog = new Catalog<>();
        catalog.setGroundList(catalog.insertGroundListCatalog());
        LOGGER.info(manager.search(catalog, p -> p.getSquare() > 200));

        catalog.foreachInMap();

        Orders orders = new Orders();
        orders.puter(manager, order);
        LOGGER.info(orders.intSumOrders(orders.getOrdersByManager(manager)));


        //BuildProces buildProces = new BuildProces(12, 30, woodHouse, );


    }

}
