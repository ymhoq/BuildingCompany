package Interfaces;

import People.Customer;
import People.Employee;
import People.Manager;

public interface IMessege {

    default void sendSms(Employee employee, Customer customer) {
        sendSms(employee);
        sendSms(customer);
    }

    void sendSms(Employee employee);

    void sendSms(Customer customer);


}
