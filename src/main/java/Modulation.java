import java.util.ArrayList;

public class Modulation {

    public static void main(String[] args) {

        Builder builder = new Builder("Peter", "Gaus", 34, 3099, "Peter@gmail.com", 1000, 0);



        Manager manager = new Manager("Kate", "Pavliuk", 24,
                38095, "kate@gmail.com", 2000);
        Owner owner = new Owner("John", "Smith", 40,
                3097, "john@gmail.com");

        Ground ground = new Ground(30, 30, 1, "West", 2);

        WoodHouse woodHouse = new WoodHouse(10, 10, 4, 0, 1, 1, 2, 40);

        Order order = new Order(1, manager, owner, ground, woodHouse, 0, false);

        builder.setLockedBuildingId(order.getId());

        //BuildProces buildProces = new BuildProces(12, 30, woodHouse, );



    }

}
