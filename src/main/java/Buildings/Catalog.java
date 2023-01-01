package Buildings;

import Enums.Directions;
import ManagerMenu.Order;
import ManagerMenu.Orders;

import java.util.*;
import java.util.stream.Collectors;


public class Catalog<G extends Ground, T extends Building> {

    private List<G> groundList = new ArrayList<>();
    private LinkedList<G> groundOnOrderList = new LinkedList<>();
    private List<T> finishedBuldings = new ArrayList<>();

    private Map<G, T> usedGrounds = new HashMap<>();

    public Catalog() {
    }

    public Catalog(List<G> groundList) {
        this.groundList = groundList;
    }

    private LinkedList<G> getGroundOnOrderList() {
        return groundOnOrderList;
    }

    private void setGroundOnOrderList(LinkedList<G> groundOnOrderList) {
        this.groundList = groundOnOrderList;
    }

    public List<G> getGroundList() {
        return groundList;
    }

    public void setGroundList(List<G> groundList) {
        this.groundList = groundList;
    }

    private List<T> getFinishedBuldingst() {
        return finishedBuldings;
    }

    private void setFinishedBuldings(List<T> finishedBuldings) {
        this.finishedBuldings = finishedBuldings;
    }

    public List<Ground> insertGroundListCatalog() {
        List<Ground> groundList = new ArrayList<>();
        groundList.add(new Ground(10f, 10f, 1, Directions.EAST, 1));
        groundList.add(new Ground(10, 20, 2, Directions.WEST, 1));
        groundList.add(new Ground(15, 20, 3, Directions.SOUTH, 1));
        groundList.add(new Ground(20, 20, 4, Directions.NORTH, 1));

        return groundList;
    }

    private Office insertStandartOffice() {
        return new Office(10, 20, 5, 0, 0, 50);
    }

    private WoodHouse insertStandartWoodHouse() {
        return new WoodHouse(5, 8, 0, 3, 0, 1, 1, 20);
    }

    public Ground maxSizeOfGList() {
        return groundList.stream().max(Comparator.comparing(Ground::getSquare)).orElseThrow(NoSuchElementException::new);
    }

    public static Ground minPrice(List<Order> orderList) {
        return orderList.stream().min(Comparator.comparing(Order::getAmount)).orElseThrow(NoSuchElementException::new).getGround();
    }

    public List<Ground> getGroundListByDirection(Directions direction) {
        List<Ground> groundListByDirection = new ArrayList<>();
        groundListByDirection = this.groundList.stream().filter(filter -> filter.getDirections().equals(direction)).collect(Collectors.toUnmodifiableList());
        return groundListByDirection;
    }


    public Map<G, T> getUsedGrounds() {
        return usedGrounds;
    }

    public void setUsedGrounds(Map<G, T> usedGrounds) {
        this.usedGrounds = usedGrounds;
    }

    public void foreachInMap() {
        List<Ground> groundList = new ArrayList<>();

        groundList = insertGroundListCatalog();

        usedGrounds.put((G) groundList.get(1), (T) insertStandartWoodHouse());
        usedGrounds.put((G) groundList.get(2), (T) insertStandartWoodHouse());
        usedGrounds.put((G) groundList.get(3), (T) insertStandartOffice());
        usedGrounds.put((G) groundList.get(0), (T) insertStandartOffice());

        //usedGrounds.forEach(Map.Entry<G, T> entry : entrySet()); {}
    }
}