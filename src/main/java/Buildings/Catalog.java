package Buildings;

import java.util.*;


public class Catalog <G extends Ground, T extends Building>{

    private List<G> groundList = new ArrayList<>();
    private LinkedList<G> groundOnOrderList = new LinkedList<>();
    private List<T> finishedBuldings = new ArrayList<>();

    private Map<G,T> usedGrounds = new HashMap<>() ;

    public Catalog() {}

    public Catalog(List<G> groundList) {
         this.groundList = groundList;
     }

     private LinkedList<G> getGroundOnOrderList() {
        return groundOnOrderList;
     }

     private void setGroundOnOrderList(LinkedList<G> groundOnOrderList) {
         this.groundList = groundOnOrderList;
     }

    private List<G> getGroundList() {
        return groundList;
    }
    private void setGroundList(List<G> groundList) {
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
        groundList.add(new Ground(10f, 10f,1, "east", 1));
        groundList.add(new Ground(10,20, 2, "west", 1));
        groundList.add(new Ground(15, 20, 3,"south", 1));
        groundList.add(new Ground(20, 20, 4,"north", 1));

        return groundList;
    }

    private Office insertStandartOffice() {
        Office office = new Office(10, 20 , 5, 0, 0, 50);
        return office;
    }

    private WoodHouse insertStandartWoodHouse() {
        WoodHouse woodHouse = new WoodHouse( 5, 8, 0, 3, 0, 1, 1, 20);
        return woodHouse;
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

        //usedGrounds.forEach();
    }
}