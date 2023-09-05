package main;

import com.google.gson.Gson;

import java.util.LinkedList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.MyCustomException;
import model.classes.Customer;
import model.daoimplementations.CustomerDAOImplementations;

@WebService(serviceName = "DatabaseWebService")
public class DatabaseWebService {

    CustomerDAOImplementations dao = new CustomerDAOImplementations();

    @WebMethod(operationName = "listCustomersSOAP")
    public String listCustomersSOAP() {
        Gson gson = new Gson();
        LinkedList<Customer> list = dao.listCustomers();
        String json = gson.toJson(list);
        return json;
    }
    
    @WebMethod(operationName = "addCustomerSOAP")
    public int addCustomerSOAP(@WebParam(name = "name") String name, @WebParam(name = "address") String address,
            @WebParam(name = "phoneNumber") String phoneNumber, @WebParam(name = "email") String email,
            @WebParam(name = "date") String date, @WebParam(name = "accountBalance") float accountBalance,
            @WebParam(name = "lastPurchase") String lastPurchase) {
        try {
            Customer customer = new Customer(0, name, address, phoneNumber, email, date, accountBalance, lastPurchase);
            dao.add(customer);
            return 1;
        } catch (MyCustomException e) {
            return 0;
        }
    }
    
    @WebMethod(operationName = "editCustomerSOAP")
    public int editCustomerSOAP(@WebParam(name = "id") int id, @WebParam(name = "name") String name,
            @WebParam(name = "address") String address, @WebParam(name = "phoneNumber") String phoneNumber,
            @WebParam(name = "email") String email, @WebParam(name = "date") String date,
            @WebParam(name = "accountBalance") float accountBalance, @WebParam(name = "lastPurchase") String lastPurchase) {
        try {
            Customer customer = new Customer(id, name, address, phoneNumber, email, date, accountBalance, lastPurchase);
            dao.edit(customer);
            return 1;
        } catch (MyCustomException e) {
            return 0;
        }
    }
    
    @WebMethod(operationName = "deleteCustomer")
    public int deleteCustomer(@WebParam(name = "id") int id) {
        try {
            dao.delete(id);
            return 1;
        } catch (MyCustomException e) {
            return 0;
        }
    }
}
