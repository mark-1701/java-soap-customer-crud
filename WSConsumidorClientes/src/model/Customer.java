package model;

public class Customer {
    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String date;
    private float accountBalance;
    private String lastPurchase;

    public Customer() {
    }

    public Customer(int id, String name, String address, String phoneNumber, String email, String date, float accountBalance, String lastPurchase) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.date = date;
        this.accountBalance = accountBalance;
        this.lastPurchase = lastPurchase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getLastPurchase() {
        return lastPurchase;
    }

    public void setLastPurchase(String lastPurchase) {
        this.lastPurchase = lastPurchase;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", date=" + date + ", accountBalance=" + accountBalance + ", lastPurchase=" + lastPurchase + '}';
    } 
}
