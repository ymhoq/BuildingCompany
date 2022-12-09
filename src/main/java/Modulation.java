import Buildings.Catalog;
import Buildings.Ground;
import Buildings.WoodHouse;
import Exeptions.IncorrectDataExсeption;
import People.Builder;
import People.Manager;
import People.Owner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Modulation {
    private static final Logger LOGGER = LogManager.getLogger(Modulation.class);
    public static void main(String[] args)  {


        Builder builder = null;
        try {
            builder = new Builder("Peter", "Gaus", 34, "3099", "Peter@gmail.com", 1000, 0);
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }

        LOGGER.info(builder);

        Manager manager = null;
        try {
            manager = new Manager("Kate", "Pavliuk", 24,
                    "38095", "kate@gmail.com", 2000);
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }
        Owner owner = null;
        try {
            owner = new Owner("John", "Smith", 40,
                    "3097", "john@gmail.com");
        } catch (IncorrectDataExсeption e) {
            LOGGER.error(e);
        }

        Ground ground = new Ground(30, 30, 1, "West", 2);

        WoodHouse woodHouse = new WoodHouse(10, 10, 4, 0, 1, 1, 2, 40);

        Order order = new Order(1, manager, owner, ground, woodHouse, 0, false);

        builder.setLockedBuildingId(order.getId());


        Catalog catalog = new Catalog<>();
        catalog.insertGroundListCatalog();
        catalog.foreachInMap();

        //BuildProces buildProces = new BuildProces(12, 30, woodHouse, );



    }

}
