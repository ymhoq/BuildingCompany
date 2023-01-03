package ManagerMenu;

import java.util.Objects;

import Buildings.Building;
import Buildings.Ground;
import Interfaces.ICount;
import People.Manager;
import People.Customer;
import fi.IOrderAmount;

public class Order implements ICount {
    private int id;
    private Manager manager;
    private Customer customer;
    private Ground ground;
    private Building building;
    private int amount;
    private boolean statusPay;

    public Order() {
    }

    public Order(int id, Manager manager, Customer customer, Ground ground, Building building, int amount, boolean statusPay) {
        this.id = id;
        this.manager = manager;
        this.customer = customer;
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

    public Customer getOwner() {
        return customer;
    }

    public void setOwner(Customer customer) {
        this.customer = customer;
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

    public int countAmountOfOrder(Order order, IOrderAmount amount) {
        int cost;
        cost = amount.count(order);
        return cost;
    }


    @Override
    public float getBuildTime() {
        return building.getSquare() * ground.getCoeffCount();
    }

    @Override
    public float getPrice() {
        return building.getSquare()*ground.getCoeffCount()+ ground.getSquare()* ground.getCoeffCount();
    }

    public String toString() {
        return "Order Id: " + id + "\n"
                + "Manager : " + manager.toString()
                + "\n" + "Owner: " + customer.toString()
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
                && Objects.equals(customer, that.customer) && Objects.equals(ground, that.ground)
                && Objects.equals(building, that.building) && Objects.equals(amount, that.amount)
                && Objects.equals(statusPay, that.statusPay);
    }

    public int hashCode() {
        int result = 1;
        result = 29 * result + (manager == null ? 0 : manager.hashCode())
                + (customer == null ? 0 : customer.hashCode())
                + (ground == null ? 0 : ground.hashCode())
                + (building == null ? 0 : building.hashCode())
        //     + (amount == null ? 0 : hashCode(amount))
        ;
        return result;
    }

}
