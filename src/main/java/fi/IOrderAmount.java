package fi;

import ManagerMenu.Order;

@FunctionalInterface
public interface IOrderAmount {
    int count(Order order);
}
