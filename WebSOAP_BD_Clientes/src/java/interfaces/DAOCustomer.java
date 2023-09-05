package interfaces;

import java.util.LinkedList;
import model.MyCustomException;
import model.classes.Customer;

public interface DAOCustomer {
    public LinkedList<Customer> listCustomers();
    public void add(Customer customer) throws MyCustomException;
    public void edit(Customer customer) throws MyCustomException;
    public void delete(int id) throws MyCustomException;

}
