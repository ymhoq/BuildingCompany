package ManagerMenu;

import People.Manager;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Orders {

    private static Map<Manager, Order> orderList;

    public Orders() {
        orderList = new HashMap<>();
    }


    public Map<Manager, Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(Map<Manager, Order> orderList) {
        this.orderList = orderList;
    }

   public void puter(Manager manager, Order order) {
       orderList.put(manager, order);
   }

    public List<Order> getOrdersByManager(Manager manager) {
       return orderList.entrySet().stream().filter(Objects::nonNull).filter(managerOrderEntry -> managerOrderEntry.getKey().equals(manager)).map(Map.Entry::getValue).collect(Collectors.toList());
    }

    public int intSumOrders(List<Order> orderList) {
       return orderList.stream().mapToInt(a -> a.getAmount()).sum();
    }

}
