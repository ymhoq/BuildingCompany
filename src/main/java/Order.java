import java.util.Objects;

public class Order {
    private int id;
    private Manager manager;
    private Owner owner;
    private Ground ground;
    private Building building;
    private int amount;
    private boolean statusPay;

    public Order() {
    }

    public Order(int id, Manager manager, Owner owner, Ground ground, Building building, int amount, boolean statusPay) {
        this.id = id;
        this.manager = manager;
        this.owner = owner;
        this.ground = ground;
        this.building = building;
        this.amount = amount;
        this.statusPay = statusPay;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Ground getGround() {
        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isStatusPay() {
        return statusPay;
    }

    public void setStatusPay(boolean statusPay) {
        this.statusPay = statusPay;
    }

    public String toString() {
        return "Order Id: " + id + "\n"
                + "Manager : " + manager.toString()
                + "\n" + "Owner: " + owner.toString()
                + "\n" + "Amount: " + amount
                + "\n" + "Status of payment: " + statusPay + "\n";
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Order that = (Order) o;
        return Objects.equals(id, that.id) && Objects.equals(manager, that.manager)
                && Objects.equals(owner, that.owner) && Objects.equals(ground, that.ground)
                && Objects.equals(building, that.building) && Objects.equals(amount, that.amount)
                && Objects.equals(statusPay, that.statusPay) ;
    }

    public int hashCode() {
        int result = 1;
        result = 29 * result + (manager == null ? 0 : manager.hashCode())
                + (owner == null ? 0 : owner.hashCode())
                + (ground == null ? 0 : ground.hashCode())
                + (building == null ? 0 : building.hashCode())
           //     + (amount == null ? 0 : hashCode(amount))
        ;
        return result;
    }
}
