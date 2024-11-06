package com.pluralsight;

public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private Vehicle vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String date, String customerName, String customerEmail, Vehicle vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Vehicle getVehicleSold() {
        return vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();

    @Override
    public String toString() {
        return "Contract ||" +
                " Date:'" + date +
                ", Customer Name: " + customerName +
                ", Customer E-Mail: " + customerEmail +
                ", Is the vehicle sold: " + vehicleSold +
                ", Total Price: " + getTotalPrice() +
                ", Monthly Payment: " + getMonthlyPayment();
    }
}