package model;

public class Model {
    public static String listCustomersSOAP() {
        model.DatabaseWebService_Service service = new model.DatabaseWebService_Service();
        model.DatabaseWebService port = service.getDatabaseWebServicePort();
        return port.listCustomersSOAP();
    }

    public static int addCustomerSOAP(java.lang.String name, java.lang.String address, java.lang.String phoneNumber, java.lang.String email, java.lang.String date, float accountBalance, java.lang.String lastPurchase) {
        model.DatabaseWebService_Service service = new model.DatabaseWebService_Service();
        model.DatabaseWebService port = service.getDatabaseWebServicePort();
        return port.addCustomerSOAP(name, address, phoneNumber, email, date, accountBalance, lastPurchase);
    }

    public static int editCustomerSOAP(int id, java.lang.String name, java.lang.String address, java.lang.String phoneNumber, java.lang.String email, java.lang.String date, float accountBalance, java.lang.String lastPurchase) {
        model.DatabaseWebService_Service service = new model.DatabaseWebService_Service();
        model.DatabaseWebService port = service.getDatabaseWebServicePort();
        return port.editCustomerSOAP(id, name, address, phoneNumber, email, date, accountBalance, lastPurchase);
    }

    public static int deleteCustomer(int id) {
        model.DatabaseWebService_Service service = new model.DatabaseWebService_Service();
        model.DatabaseWebService port = service.getDatabaseWebServicePort();
        return port.deleteCustomer(id);
    }
}
