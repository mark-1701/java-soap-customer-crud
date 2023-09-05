package controller;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Customer;
import model.Model;
import view.NewView;

public class Controller extends MouseAdapter implements ActionListener {

    private NewView view;
    private Model model;

    public Controller(NewView view, Model model) {
        this.view = view;
        this.model = model;

        this.view.btnClean.addActionListener(this);
        this.view.btnAdd.addActionListener(this);
        this.view.btnUpdate.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        this.view.tableCustomers.addMouseListener(this);
    }

    public void start() {
        view.setTitle("Sistema Clientes");
        view.setResizable(false);
        view.setLocationRelativeTo(null);
        loadTableCustomers();
        view.textID.setEditable(false);
    }

    public void printInformation() {
//        model.listVehicles();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.btnClean) {
            cleanScreen();
        }
        if (e.getSource() == view.btnAdd) {
            if (fieldValidation()) {
                String name = view.textName.getText();
                String address = view.textAddress.getText();
                String phoneNumber = view.textPhoneNumber.getText();
                String email = view.textEmail.getText();
                String date = view.textDate.getText();
                float accountBalance = Float.parseFloat(view.textAccountBalance.getText());
                String lastPurchase = view.textLastPurchase.getText();

  
                int response = model.addCustomerSOAP(name, address, phoneNumber, email, date, accountBalance, lastPurchase);
                if (response == 1) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar al cliente");
                }
                
                loadTableCustomers();
            }
        }
        if (e.getSource() == view.btnUpdate) {
            if (fieldValidation()) {
                int id = Integer.valueOf(view.textID.getText());
                String name = view.textName.getText();
                String address = view.textAddress.getText();
                String phoneNumber = view.textPhoneNumber.getText();
                String email = view.textEmail.getText();
                String date = view.textDate.getText();
                float accountBalance = Float.parseFloat(view.textAccountBalance.getText());
                String lastPurchase = view.textLastPurchase.getText();

                int response = model.editCustomerSOAP(id, name, address, phoneNumber, email, date, accountBalance, lastPurchase);
                if (response == 1) {
                    JOptionPane.showMessageDialog(null, "Cliente actualizado exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al actualizar al cliente");
                }
                loadTableCustomers();
            }
        }
        if (e.getSource() == view.btnDelete) {
            int id = Integer.valueOf(view.textID.getText());
            model.deleteCustomer(id);
            loadTableCustomers();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == view.tableCustomers) {
            selectDatos();
        }
    }

    private void loadTableCustomers() {
        String json = model.listCustomersSOAP();
        JsonParser jsonParser = new JsonParser();
        JsonArray matriz = jsonParser.parse(json).getAsJsonArray();

        String columns[] = {"ID", "Nombre", "Dirección", "Telefono", "Correo", "Nacimiento", "Saldo", "Ul-Compra"};
        DefaultTableModel table = new DefaultTableModel(null, columns);
        for (int i = 0; i < matriz.size(); i++) {
            JsonObject object = matriz.get(i).getAsJsonObject();

            Object row[] = new Object[9];
            row[0] = object.get("id").getAsString();
            row[1] = object.get("name").getAsString();
            row[2] = object.get("address").getAsString();
            row[3] = object.get("phoneNumber").getAsString();
            row[4] = object.get("email").getAsString();
            row[5] = object.get("date").getAsString();
            row[6] = object.get("accountBalance").getAsString();
            row[7] = object.get("lastPurchase").getAsString();
            table.addRow(row);
        }
        view.tableCustomers.setModel(table);
    }

    private boolean fieldValidation() {
        String name = view.textName.getText();
        String address = view.textAddress.getText();
        String phoneNumber = view.textPhoneNumber.getText();
        String email = view.textEmail.getText();
        String date = view.textDate.getText();
        String accountBalance = view.textAccountBalance.getText();
        String lastPurchase = view.textLastPurchase.getText();
        
        if (name.isEmpty() | address.isEmpty() | phoneNumber.isEmpty() | email.isEmpty() | date.isEmpty()
                 | accountBalance.isEmpty() | lastPurchase.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");
            return false;
        }
        return true;
    }

    private void cleanScreen() {
        view.textID.setText("");
        view.textName.setText("");
        view.textAddress.setText("");
        view.textPhoneNumber.setText("");
        view.textEmail.setText("");
        view.textDate.setText("");
        view.textAccountBalance.setText("");
        view.textLastPurchase.setText("");
    }

    public void selectDatos() {
        int row = view.tableCustomers.getSelectedRow();
        view.textID.setText(view.tableCustomers.getValueAt(row, 0).toString());
        view.textName.setText(view.tableCustomers.getValueAt(row, 1).toString());
        view.textAddress.setText(view.tableCustomers.getValueAt(row, 2).toString());
        view.textPhoneNumber.setText(view.tableCustomers.getValueAt(row, 3).toString());
        view.textEmail.setText(view.tableCustomers.getValueAt(row, 4).toString());
        view.textDate.setText(view.tableCustomers.getValueAt(row, 5).toString());
        view.textAccountBalance.setText(view.tableCustomers.getValueAt(row, 6).toString());
        view.textLastPurchase.setText(view.tableCustomers.getValueAt(row, 7).toString());
    }

}
