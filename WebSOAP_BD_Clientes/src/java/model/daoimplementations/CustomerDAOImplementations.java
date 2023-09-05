package model.daoimplementations;

import config.MySQLConnection;
import interfaces.DAOCustomer;
import java.sql.*;
import java.util.LinkedList;
import model.MyCustomException;
import model.classes.Customer;

public class CustomerDAOImplementations implements DAOCustomer {

    MySQLConnection mcon = new MySQLConnection();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    @Override
    public LinkedList<Customer> listCustomers() {
        LinkedList<Customer> list = new LinkedList<Customer>();
        String query = "SELECT * FROM clientes";
        try {
            //Inicializa la base de datos
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                Customer cliente = new Customer();
                cliente.setId(rs.getInt(1));
                cliente.setName(rs.getString(2));
                cliente.setAddress(rs.getString(3));
                cliente.setPhoneNumber(rs.getString(4));
                cliente.setEmail(rs.getString(5));
                cliente.setDate(rs.getString(6));
                cliente.setAccountBalance(rs.getFloat(7));
                cliente.setLastPurchase(rs.getString(8));
                list.add(cliente);
            }
        } catch (Exception e) {
            System.out.println("ERROR LISTA CLIENTES: " + e);
        }
        return list;
    }

    @Override
    public void add(Customer customer) throws MyCustomException {
        try {
            String query = "INSERT INTO clientes VALUES (0,?,?,?,?,?,?,?);";
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getAddress());
            ps.setString(3, customer.getPhoneNumber());
            ps.setString(4, customer.getEmail());
            ps.setString(5, customer.getDate());
            ps.setFloat(6, customer.getAccountBalance());
            ps.setString(7, customer.getLastPurchase());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new MyCustomException("ERROR AL AGREGAR CLIENTE", e);
        }
    }

    @Override
    public void edit(Customer customer) throws MyCustomException {
        String query = "UPDATE clientes SET nombre=?, direccion=?, telefono=?, correo=?, fecha_nacimiento=?, saldo=?, ultima_compra=? WHERE id=?;";
        try {
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, customer.getName());
            ps.setString(2, customer.getAddress());
            ps.setString(3, customer.getPhoneNumber());
            ps.setString(4, customer.getEmail());
            ps.setString(5, customer.getDate());
            ps.setFloat(6, customer.getAccountBalance());
            ps.setString(7, customer.getLastPurchase());
            ps.setInt(8, customer.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new MyCustomException("ERROR AL MODIFICAR CLIENTE", e);      
        }
    }

    @Override
    public void delete(int id) throws MyCustomException {
        String query = "DELETE FROM clientes WHERE id=?";
        try {
            con = mcon.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            throw new MyCustomException("ERROR AL MODIFICAR CLIENTE", e);
        }
    }

}
